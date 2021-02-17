
import java.util.ArrayList;


public class Pakka {
    private ArrayList<String> pakka;
    
    public Pakka(){
        this.pakka = new ArrayList<>();
    }
    public void lisaa(String arvo) {
        pakka.add(arvo);
    }
    public boolean onTyhja() {
        if (pakka.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<String> arvot(){
        //for (int i = 0; i < pakka.size(); i++){
           // return "[" + pakka.get(i) + "]";
           return (pakka);
        }
    public String ota() {
        String temp = pakka.get(pakka.size()-1);
        pakka.remove(pakka.get(pakka.size()-1));
        return temp;
    }
    }