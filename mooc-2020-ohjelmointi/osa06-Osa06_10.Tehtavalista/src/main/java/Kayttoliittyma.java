import java.util.Scanner;

public class Kayttoliittyma {
    private Tehtavalista lista;
    private Scanner lukija;
    
    public Kayttoliittyma(Tehtavalista lista, Scanner lukija) {
        this.lista = lista;
        this.lukija = lukija;
    }
    public void kaynnista(){
        while (true) {
            System.out.print("Komento: ");
            String komento = lukija.nextLine(); 
            if(komento.equals("lopeta")) {
                System.out.println("Hei Hei!");
                break;
            } if (komento.equals("lisaa")) {
                System.out.print("Lisättävä: ");
                String lisattava = lukija.nextLine();
                lista.lisaa(lisattava);
                continue;    
            } if (komento.equals("listaa")) {
                lista.tulosta();
                continue;  
            } if (komento.equals("poista")) {
                System.out.print("Mikä poistetaan? : ");
                int poista = Integer.valueOf(lukija.nextLine());
                lista.poista(poista);                
            }
        }
    }
}
