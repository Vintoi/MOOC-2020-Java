
public class TulosteluaLikeABoss {

    public static void tulostaTahtia(int maara) {
        // tehtävän osa 1
        for (int i = 0 ; i < maara; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // tehtävän osa 1
        for (int i = 0 ; i < maara ; i++) {
            System.out.print(" ");
        }
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän osa 2
        
        /*for (int i = 1 ; i-1 < koko ; i++) {
            
        for (int j = koko ; j <= koko ; j--) {
            tulostaTyhjaa(j);
            // System.out.print(" ");
        }
            for (int j = 1; j+1 <= i; j++) {
            tulostaTahtia(j);
            //System.out.print("* ");
        }
            System.out.println(" ");
        } */
        for (int i = 1; i <= koko; i++ ) {
            tulostaTyhjaa(koko - i);
            tulostaTahtia(i);
        }
            
    }

    public static void jouluKuusi(int korkeus) {
        // tehtävän osa 3
        int i = 1;
        while (i <= korkeus) {
            tulostaTyhjaa(korkeus - i);
            tulostaTahtia(i + (i - 1));
            i++;
        }
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        tulostaTyhjaa(korkeus - 2);
        tulostaTahtia(3);
        
    }
        

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(4);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(10);
    }
}
