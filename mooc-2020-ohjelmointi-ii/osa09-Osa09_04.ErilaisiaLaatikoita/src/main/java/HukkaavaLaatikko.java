
import java.util.ArrayList;


public class HukkaavaLaatikko extends Laatikko{
    private ArrayList<Tavara> tavarat;
    
    public HukkaavaLaatikko(){
        tavarat = new ArrayList<>();

    }

    @Override
    public void lisaa(Tavara tavara) {
        if (this.tavarat.size() >= 0) {

        }            
        }

    @Override
    public boolean onkoLaatikossa (Tavara tavara) {
        
        if (this.tavarat.contains(tavara)){
            this.tavarat.remove(tavara);
            return true;
        } else {
        
            return false;
        }
    }
    
}
