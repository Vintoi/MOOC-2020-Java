
import java.util.ArrayList;


public class Vitsipankki {
    private ArrayList<String> vitsit;
    
    public Vitsipankki(){
        this.vitsit = new ArrayList<>();
    }
    public void lisaaVitsi(String vitsi){
        this.vitsit.add(vitsi);
    }
    public String arvoVitsi(){
        if (vitsit.isEmpty()){
            return "Vitsit vähissä.";
        }
        int mones = (int) (Math.random() * (vitsit.size()));
        return vitsit.get(mones);
    }
    public void tulostaVitsit(){
        for (int i = 0 ; i < vitsit.size();i++){
            System.out.println(vitsit.get(i));
        }
    }
}
