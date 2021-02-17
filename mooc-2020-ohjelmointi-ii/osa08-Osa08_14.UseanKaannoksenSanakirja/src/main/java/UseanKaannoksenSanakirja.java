
import java.util.ArrayList;
import java.util.HashMap;


public class UseanKaannoksenSanakirja {
    private HashMap<String, ArrayList<String>> sanakirja;
    
    public UseanKaannoksenSanakirja(){
        this.sanakirja = new HashMap<>();
    }
    public void lisaa(String sana, String kaannos){
        
        this.sanakirja.putIfAbsent(sana, new ArrayList<>());
        
        ArrayList<String> kirja = this.sanakirja.get(sana);
        
        kirja.add(kaannos);

    }
    
    public ArrayList<String> kaanna(String sana) {
        if (this.sanakirja.containsKey(sana)) {
            return this.sanakirja.get(sana);
        } else {
            ArrayList<String> uusi = new ArrayList<>();
            return uusi;
        }
    }
    
    
    public void poista(String sana) {
        sanakirja.remove(sana);
    }
}
