
import java.util.HashMap;
import java.util.Map;


public class Ostoskori {
    private Map<String, Ostos> kori;
    
    public Ostoskori() {
        this.kori = new HashMap<>();
        
    }
    public void lisaa(String tuote, int hinta) {
        if (this.kori.containsKey(tuote)){
            int uusi = this.kori.get(tuote).hinta() + hinta;
            for (Ostos ostos : this.kori.values()){
                if(ostos.toString().startsWith(tuote)){
                    ostos.kasvataMaaraa();
                }
            }
        } else {
        Ostos ostos = new Ostos(tuote, 1, hinta);
        this.kori.put(tuote, ostos);
        }
    }
    
    public int hinta() {
        int hinta = 0;
        for (Ostos ostos : this.kori.values()) {
            hinta = hinta + ostos.hinta();
        }
        return hinta;
    }
    public void tulosta() {
        for (Ostos ostos : this.kori.values()){
            System.out.println(ostos.toString());
        }
    }
    
}
