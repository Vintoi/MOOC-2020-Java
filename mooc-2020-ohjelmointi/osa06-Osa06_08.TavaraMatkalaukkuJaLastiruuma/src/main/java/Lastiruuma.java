import java.util.ArrayList;

public class Lastiruuma {
    private int max;
    private int paino;
    private ArrayList<Matkalaukku> laukut;
    
    public Lastiruuma(int max) {
        this.laukut = new ArrayList<>();
        this.max = max;
    }
    public void lisaaMatkalaukku(Matkalaukku laukku){
        if (this.paino + laukku.getPaino() > max){
        } else {
        laukut.add(laukku);
        paino = paino + laukku.getPaino();
        }
    }
    @Override
    public String toString() {
        if (laukut.isEmpty()) {
            return "ei matkalaukkuja (" + this.paino + " kg)";
        } else if (laukut.size() == 1){
            return laukut.size() + " matkalaukku (" + this.paino + " kg)";
        } else {
            return laukut.size() + " matkalaukkua (" + this.paino + " kg)";
        }
    }
    public void tulostaTavarat() {
        for (Matkalaukku laukku : this.laukut) {
            laukku.tulostaTavarat();
        
        }
    }
}
