
public class Henkilo {
    private String nimi;
    private int ika;
    
    public Henkilo (String nimi){
        this.nimi = nimi;
        this.ika = 0;
    }
        public void vanhene() {
        this.ika = this.ika + 1;
    }
    
}
