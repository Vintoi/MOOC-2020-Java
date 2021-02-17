
public class CDLevy implements Talletettava {
    private String nimi;
    private String tekija;
    private int vuosi;
    private double paino;
    
    public CDLevy(String tekija, String nimi , int vuosi){
        this.nimi = nimi;
        this.tekija = tekija;
        this.vuosi = vuosi;
        this.paino = 0.1;
    }
    @Override
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString(){
        return this.tekija + ": " + this.nimi + " ("+this.vuosi+")";
    }
    
}
