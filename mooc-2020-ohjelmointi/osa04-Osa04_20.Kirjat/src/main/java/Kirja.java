
public class Kirja {
    private String nimi;
    private int sivut;
    private int julkaisuv;
    
public Kirja (String nimi, int sivut, int julkaisuv) {
    this.nimi = nimi;
    this.sivut = sivut;
    this.julkaisuv = julkaisuv;
}
    public String getNimi() {
        return nimi;
    }

    public int getSivut() {
        return sivut;
    }
    public int getJulkaisuvuosi() {
        return julkaisuv;
    }

    @Override
    public String toString() {
        return this.nimi + ", " + this.sivut + " sivua, " + this.julkaisuv;
    }
}