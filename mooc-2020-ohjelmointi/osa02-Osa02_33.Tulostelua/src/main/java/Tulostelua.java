
public class Tulostelua {

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(3);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(4);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(3);
        System.out.println("\n---");
    }

    public static void tulostaTahtia(int maara) {
        // tehtävän ensimmäinen osa
        for (int i = 0; i < maara; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // tehtävän toinen osa
        for (int k = 0; k < sivunpituus ; k++) {
            for (int i = 0; i < sivunpituus; i++) {
                System.out.print("*");
            }       
            System.out.println("");
        }
    }
    

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // tehtävän kolmas osa
        for (int i = 0; i < korkeus ; i++){
            for (int k = 0; k < leveys ; k++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
            
    }

    public static void tulostaKolmio(int koko) {
        // tehtävän neljäs osa
  
        for (int i = 0; i < koko ; i++) {
        
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

