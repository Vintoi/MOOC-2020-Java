
public class Ostos {
    private String tuote;
    private int kpl;
    private int yksHinta;
    
    public Ostos(String tuote, int kpl, int yksikkohinta) {
        this.tuote = tuote;
        this.kpl = kpl;
        this.yksHinta = yksikkohinta;
    }
    public int hinta() {
        return this.yksHinta * kpl;
    }
    public void kasvataMaaraa() {
        this.kpl = kpl + 1;
    }
    public String toString() {
        return this.tuote + ": " + this.kpl;
    }
    
    
}
