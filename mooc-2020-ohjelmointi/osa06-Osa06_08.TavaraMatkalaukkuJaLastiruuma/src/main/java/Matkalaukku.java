
import java.util.ArrayList;


public class Matkalaukku {
    private ArrayList<Tavara> tavarat;
    private int paino;
    private int max;
    
    public Matkalaukku(int max){
        this.tavarat = new ArrayList<>();
        this.max = max;
    }
    public void lisaaTavara(Tavara tavara){
        if (paino + tavara.getPaino() > max){
           
        } else {
        tavarat.add(tavara);
        paino = paino + tavara.getPaino();
        }
    }
    public void tulostaTavarat(){
        for (int i = 0; i <tavarat.size() ; i++){
            System.out.println(tavarat.get(i));
        }
    }
    public int getPaino(){
        return paino;
    }
    public int yhteispaino(){
        return this.paino;
    }
    public Tavara raskainTavara(){
        if (tavarat.isEmpty()) {
            return null;
        } else {
            int raskain = tavarat.get(0).getPaino();
            Tavara t_raskain = tavarat.get(0);
            for (int i = 0; i < tavarat.size(); i++) {
                if (raskain < tavarat.get(i).getPaino()) {
                    raskain = tavarat.get(i).getPaino();
                    t_raskain = tavarat.get(i);
                } 
            }
            return t_raskain;

        }
    }   
        
    @Override
    public String toString(){
        if (tavarat.isEmpty()) {
            return "ei tavaroita (" + this.paino + " kg)";
        } else if (tavarat.size() == 1){
            return tavarat.size() + " tavara (" + this.paino + " kg)";
        } else {
            return tavarat.size() + " tavaraa (" + this.paino + " kg)";
        }
    }

}
