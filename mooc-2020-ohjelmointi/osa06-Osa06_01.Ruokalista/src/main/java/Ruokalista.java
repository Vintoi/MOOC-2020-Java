
import java.util.ArrayList;

public class Ruokalista {

    private ArrayList<String> ateriat;

    public Ruokalista() {
        this.ateriat = new ArrayList<>();
    }

    // toteuta tänne tarvittavat metodit
    public void lisaaAteria(String ateria){
        if (ateriat.contains(ateria)){
            
        } else {
        this.ateriat.add(ateria);
        }
    }
    public void tulostaAteriat()  {
        for (int i = 0 ; i < ateriat.size();i++) {
            System.out.println(ateriat.get(i));
        }
    }
    public void tyhjennaRuokalista(){
        int temp = ateriat.size();
        for (int i = 0 ; i < temp ;i++) {
            ateriat.remove(ateriat.get(0));
        }
    }
}
