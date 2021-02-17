
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        System.out.println("Mitä etsitään?");
        String etsittava = lukija.nextLine();

        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                lista.add(tiedostonLukija.nextLine());
            }
        }  catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + "lukeminen epäonnistui.");
        }
        /*System.out.println(lista.size());
        for (int i = 0 ; i < lista.size(); i++ ) {
            System.out.println(lista.get(i));
        }*/
            //for (int i = 0 ; i <= lista.size(); i++) {
                if (lista.contains(etsittava)) {
                    System.out.println("Löytyi!");
                    
                } else {
                    System.out.println("Ei löytynyt.");
                }
                
            //}
            
    }
}