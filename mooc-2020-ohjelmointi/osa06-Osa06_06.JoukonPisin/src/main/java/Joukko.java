
import java.util.ArrayList;

public class Joukko {

    private String nimi;
    private ArrayList<String> alkiot;

    public Joukko(String nimi) {
        this.nimi = nimi;
        this.alkiot = new ArrayList<>();
    }

    public void lisaa(String alkio) {
        this.alkiot.add(alkio);
    }

    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    public String pisin() {
        int max = 0;
        String pisin = "";
        if (alkiot.isEmpty()){
            return null;
        } else {
            for (int i = 0; i < alkiot.size();i++){
            if (max < alkiot.get(i).length()){
                max = Integer.valueOf(alkiot.get(i).length());
                pisin = alkiot.get(i);
                }
            }
            return pisin;
        }
        
    }
}
