
public class Tuote {
    
    private String Tuote;
    private int kpl;
    private double hinta;
    
    public Tuote(String nimiAlussa, double hintaAlussa, int maaraAlussa) {
        this.Tuote = nimiAlussa;
        this.kpl= maaraAlussa;
        this.hinta = hintaAlussa;
        
        
        }
        public void tulostaTuote() {
            System.out.println(Tuote + ", hinta " + hinta + ", " + kpl);
    }
    
    
}
