
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class MittauksetTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.print("Tiedosto? ");
        String tiedosto = lukija.nextLine();
        System.out.print("Alaraja? ");
        int alaraja = Integer.valueOf(lukija.nextLine());
        System.out.print("Yläraja? ");
        int ylaraja = Integer.valueOf(lukija.nextLine());
        int min =0;
        int max =0;
        int lukuja = 0;
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                lista.add(Integer.valueOf(tiedostonLukija.nextLine()));
            }
        }  catch (Exception e) {
            System.out.println("Tiedoston " + tiedosto + "lukeminen epäonnistui.");
        }
        /*
            max = lista.indexOf(ylaraja);
            min = lista.indexOf(alaraja);
            System.out.println(max);
            
        for (int i = lista.indexOf(alaraja); i < lista.indexOf(ylaraja) ; i++) {
            if (lista.get(i) == max) {
                System.out.println(lista.get(i));
                break;
            }
            lukuja = lukuja + 1;
        }*/
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) >= alaraja && lista.get(i)<= ylaraja) {
                lukuja++;
            }
        }
        System.out.println("Lukuja: " + lukuja);
    }       
}