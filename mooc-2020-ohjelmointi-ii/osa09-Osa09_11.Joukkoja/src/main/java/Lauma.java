
import java.util.ArrayList;


public class Lauma implements Siirrettava {
    private ArrayList<Siirrettava> eliot;
    
    public Lauma (){
        this.eliot = new ArrayList<>();
    }
    
    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.eliot.add(siirrettava);
    }
    public String toString() {
        String sijainti = "";
        for (int i = 0; i < this.eliot.size() ; i ++) {
            sijainti = sijainti + this.eliot.get(i).toString() + "\n";
        }
        return sijainti;
    }
    public void siirra(int dx, int dy) {
        for (int i = 0; i < this.eliot.size() ; i ++) {
            this.eliot.get(i).siirra(dx, dy);
        }
    }
}
