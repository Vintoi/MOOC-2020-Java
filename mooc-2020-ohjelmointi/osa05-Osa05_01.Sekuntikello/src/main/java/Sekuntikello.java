
public class Sekuntikello {
    private Viisari sekuntti;
    private Viisari sadasosa;
    
    public Sekuntikello() {
        this.sekuntti = new Viisari(60);
        this.sadasosa = new Viisari(100);
    }
    public void etene() {
        this.sadasosa.etene();
        if (this.sadasosa.arvo() == 0) {
            this.sekuntti.etene();
        }
    }
    @Override
    public String toString() {
        return sekuntti + ":" + sadasosa;
    }
}