
import java.util.HashMap;


public class Velkakirja {
    private HashMap<String, Double> v_kirja;
    
    public Velkakirja(){
        this.v_kirja = new HashMap<>();
    }
    public void asetaLaina(String kenelle, double maara) {
        v_kirja.put(kenelle, maara);
    }
    public double paljonkoVelkaa(String kuka){
         if(this.v_kirja.containsKey(kuka)){
             return this.v_kirja.get(kuka);
         } else {
             return 0.0;
         }
    }
}
