
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
    public String getNimi() {
        return this.nimi;
}
    public ArrayList<String> getAlkiot() {
        return this.alkiot;
    }
    @Override
    public String toString(){

        if (alkiot.isEmpty()) {
            return "Joukko " + this.nimi + " on tyhjä.";
        } else if (alkiot.size() == 1){
            return "Joukossa " + this.nimi + " on " + alkiot.size() + " alkio:\n" + alkiot.get(0);
        } else {
            String joukossa = "";
            for (int i = 0; i < alkiot.size(); i++) {
            //for (Joukko joukko: alkiot) {
            joukossa =  joukossa  + alkiot.get(i) + "\n";
            }
            
        return "Joukossa " + this.nimi + " on " + alkiot.size() + " alkiota:\n" + joukossa;
     }
    }
}
