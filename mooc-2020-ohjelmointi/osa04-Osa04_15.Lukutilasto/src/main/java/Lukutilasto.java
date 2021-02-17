
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        // alusta tässä muuttuja lukujenMaara
        this.summa = 0;
        this.lukujenMaara = 0;
    }
    public void lisaaLuku(int luku) {
        this.lukujenMaara = this.lukujenMaara + 1;
        this.summa = this.summa + luku;
    }
    public int haeLukujenMaara() {
        // kirjoita koodia tähän
        return this.lukujenMaara;
    } 
    public int summa() {
        // kirjoita koodia tähän
        return this.summa;
    }

    public double keskiarvo() {
        // kirjoita koodia tähän
        if (this.lukujenMaara == 0){
            return 0;
        } else {
        double ka = 1.0* this.summa / this.lukujenMaara;
        return ka;
        }
    }
}
