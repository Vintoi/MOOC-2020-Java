
public class Kappale {

    private String esittaja;
    private String nimi;
    private int pituusSekunteina;
    

    public Kappale(String esittaja, String nimi, int pituusSekunteina) {
        this.esittaja = esittaja;
        this.nimi = nimi;
        this.pituusSekunteina = pituusSekunteina;
    }
    
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        } if (!(verrattava instanceof Kappale)){
            return false;
        }
        Kappale verrattavaKappale = (Kappale) verrattava;
        if (this.esittaja.equals(verrattavaKappale.esittaja) && this.nimi.equals(verrattavaKappale.nimi) && this.pituusSekunteina == verrattavaKappale.pituusSekunteina) {
           return true;
        } else {
            return false;
        }
    }
    public String getEsittaja(){
        return this.esittaja;
    }
    public String getNimi(){
        return this.nimi;
    }
    
    @Override
    public String toString() {
        return this.esittaja + ": " + this.nimi + " (" + this.pituusSekunteina + " s)";
    }


}
