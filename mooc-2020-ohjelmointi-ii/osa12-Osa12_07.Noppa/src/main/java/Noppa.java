
import java.util.Random;

public class Noppa {

    private Random random;
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.random = new Random();
        // Alusta muuttuja tahkojenMaara tässä
        this.tahkojenMaara = tahkojenMaara;
    }

    public int heita() {
        int luku = 0;
        // arvotaan luku väliltä 1-tahkojenMaara
        for (int i = 0; i < tahkojenMaara; i++) {
            // Arvotaan ja tulostetaan satunnainen luku
            luku = random.nextInt(tahkojenMaara);
            luku = luku+1;
        }
        return luku;
    }
}
