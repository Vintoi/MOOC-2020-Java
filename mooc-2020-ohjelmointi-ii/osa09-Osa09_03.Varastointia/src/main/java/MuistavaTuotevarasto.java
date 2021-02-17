
public class MuistavaTuotevarasto extends Tuotevarasto {
    private Muutoshistoria muutoshistoria;
    
    public MuistavaTuotevarasto(String tuotenimi, double tilavuus, double alkuSaldo) {
        super(tuotenimi, tilavuus);
        this.muutoshistoria = new Muutoshistoria();
        super.lisaaVarastoon(alkuSaldo);
        muutoshistoria.lisaa(alkuSaldo);
        
    }
    public String historia(){
        return muutoshistoria.toString();
    }
    public void lisaaVarastoon(double maara){
        super.lisaaVarastoon(maara);
        muutoshistoria.lisaa(getSaldo());
    }
    
    public double otaVarastosta(double maara){
        double tilanne = super.getSaldo();
        if(maara > tilanne) {
            super.otaVarastosta(tilanne);
            muutoshistoria.lisaa(tilanne);
            return tilanne;           
        } else {
        super.otaVarastosta(maara);
        muutoshistoria.lisaa(tilanne-maara);
        return maara;
        }
    }
    
    public void tulostaAnalyysi(){
        System.out.println("Tuote: " + super.getNimi());
        System.out.println("Historia: " + muutoshistoria.toString());
        System.out.println("Suurin tuotemäärä: " + muutoshistoria.maxArvo());
        System.out.println("Pienin tuotemäärä: " + muutoshistoria.minArvo());
        System.out.println("Keskiarvo: " + muutoshistoria.keskiarvo());
    }
}
