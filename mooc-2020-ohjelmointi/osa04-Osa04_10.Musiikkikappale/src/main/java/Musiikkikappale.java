
public class Musiikkikappale {
    private String kappale;
    private int kappale_pituus;
    
    public Musiikkikappale(String kappaleenNimi, int kappaleenPituus) {  
        this.kappale = kappaleenNimi;
        this.kappale_pituus = kappaleenPituus;
    }  
    
    public String nimi() {
        return kappale;
    }
    
    public int pituus () {
        return kappale_pituus;
    }
    
}
