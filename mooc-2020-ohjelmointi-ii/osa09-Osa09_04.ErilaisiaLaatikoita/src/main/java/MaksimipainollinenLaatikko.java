
import java.util.ArrayList;



public class MaksimipainollinenLaatikko extends Laatikko {
    private int maxpaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino) {
        this.maxpaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    @Override
    public void lisaa(Tavara tavara){
        int yht = laskePaino();
        if(yht + tavara.getPaino() <= this.maxpaino){
            tavarat.add(tavara);
        }
    }
    
    private int laskePaino() {
        int paino = 0;
        for (Tavara tavara : tavarat) {
            paino += tavara.getPaino();
        }
        return paino;
    
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara t : tavarat) {
            if (t.equals(tavara)) {
                return true;
            }
        }
        return false;
    }
    
}
