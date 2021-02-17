
import java.util.ArrayList;

public class Muutoshistoria {
    private  ArrayList<Double> historia;
    
    public Muutoshistoria(){
        this.historia = new ArrayList<Double>();
    }
    public void lisaa(double tilanne){
        this.historia.add(tilanne);
    }
    public void nollaa(){
        this.historia.clear();
    }
    public String toString(){
        /*
        String sana = "";
        for (int i = 0; i < historia.size() ; i++){
            sana = sana + String.valueOf(i) + ", " ;
       }
        return sana;
        */
        return historia.toString();
    }
    public double maxArvo(){
        if (historia.isEmpty()){
            return 0;
        } else {
        double max = historia.get(0);
        for (int i = 0; i < historia.size() ; i++){
            if (max < historia.get(i)){
                max = historia.get(i);
            }
        }
        return max;
    }
        
    }
    public double minArvo(){
        if (historia.isEmpty()){
            return 0;
        } else {
            double min = historia.get(0);
            for (int i = 0 ; i < historia.size(); i++){
                if (min > historia.get(i)){
                    min = historia.get(i);
                }
            }
        return min;
        }
        
    }
    public double keskiarvo(){
        double yht = 0;
        if (historia.isEmpty()){
            return 0;
        } else {
            
            for (int i = 0 ; i < historia.size() ; i++){
                yht = yht + historia.get(i);
                
            }
            return 1.0 * yht / historia.size();
        }
    }
}
