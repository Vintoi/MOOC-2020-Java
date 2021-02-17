
import java.util.ArrayList;


public class Pakkaus {
    private ArrayList<Lahja> lahjat;
    
    public Pakkaus (){
        this.lahjat = new ArrayList<>();
    }
    
    public void lisaaLahja(Lahja lahja) {
        lahjat.add(lahja);
    } 
    public int yhteispaino(){
        int yht = 0;
        for (int i = 0; i < lahjat.size(); i++){
            yht = yht + lahjat.get(i).getPaino();
        }
        return yht;
    }    
}
