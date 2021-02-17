
import java.util.ArrayList;


public class Laatikko implements Talletettava{
    private double max;
    private ArrayList<Talletettava> tavarat;

    public Laatikko(double max){
        tavarat = new ArrayList<>();
        this.max = max;
    }
    
    public void lisaa(Talletettava asia){
        
        if (this.paino() + asia.paino() > max) {
            
        } else {
            this.tavarat.add(asia);
        }
    }
    @Override
    public double paino() {
        double paino = 0;
        for (int i = 0; i < tavarat.size(); i++){
            paino = paino + tavarat.get(i).paino();
            
        }
        return paino;
    }
    @Override
    public String toString(){
        return "Laatikko: " + tavarat.size() + " esinettä, paino yhteensä " + this.paino() + " kiloa";
    }
    
}
