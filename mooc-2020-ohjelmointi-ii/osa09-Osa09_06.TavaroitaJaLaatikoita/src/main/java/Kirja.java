
public class Kirja implements Talletettava {
    
    private String nimi;
    private String tekija;
    private double paino;
    
    public Kirja(String tekija, String nimi, double paino){
        this.nimi = nimi;
        this.tekija = tekija;
        this.paino = paino;
    }

    @Override
    public double paino() {
        return this.paino;
    }
    
    @Override
    public String toString(){
        return this.tekija + ": " + this.nimi;
    }
    
}
