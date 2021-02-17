
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class TiedotTiedostosta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Mikä tiedosto luetaan?");
        String tiedosto = lukija.nextLine();
        // luodaan lukija tiedoston lukemista varten
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
        while (tiedostonLukija.hasNextLine()) {
            lista.add(tiedostonLukija.nextLine());
        }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        for (int i = 0; i < lista.size(); i++) {
            String[] palat = lista.get(i).split(",");
            if (palat[1].equals("1")){
                System.out.println(palat[0]+", ikä: "+ palat[1] + " vuosi");
            } else {
                System.out.println(palat[0]+", ikä: "+ palat[1] + " vuotta");
            }
        }
        
    }
}
