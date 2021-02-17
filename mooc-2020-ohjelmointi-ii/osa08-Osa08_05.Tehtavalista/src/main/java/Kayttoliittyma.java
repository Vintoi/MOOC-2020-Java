
import java.util.Scanner;


public class Kayttoliittyma {
    private Tehtavalista tehli;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.tehli = lista;
        this.lukija = lukija;
    }
    public void kaynnista(){
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine();
            if (komento.equals("lopeta")) {
                break;
            } else if (komento.equals("lisaa")) {
                System.out.print("Lisättävä: ");
                String k = lukija.nextLine();
                this.tehli.lisaa(k);
            } else if (komento.equals("poista")){
                System.out.print("Mika poistetaan? ");
                String k = lukija.nextLine();
                this.tehli.poista(Integer.valueOf(k));
            } else if (komento.equals("listaa")){
                this.tehli.tulosta();
            }
        }
    }
} 
