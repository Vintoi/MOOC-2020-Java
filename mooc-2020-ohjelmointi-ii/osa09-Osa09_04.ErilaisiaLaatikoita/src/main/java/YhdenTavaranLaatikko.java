
import java.util.ArrayList;


public class YhdenTavaranLaatikko extends Laatikko{
    private ArrayList<Tavara> tavarat;
    
    public YhdenTavaranLaatikko(){
        tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        if (tavarat.size() >= 1){
            
        } else {
         this.tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        if(this.tavarat.contains(tavara)){
            return true;
        } else {
            return false;
        }
    }
}
