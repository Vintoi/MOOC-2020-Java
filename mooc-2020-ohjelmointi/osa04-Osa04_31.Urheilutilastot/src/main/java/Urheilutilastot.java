
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Urheilutilastot {

    public static void main(String[] args) {
        int ottelut = 0;
        int voitot = 0;
        int tappiot = 0;
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();
        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();
        System.out.println("Minkä nimisen joukkueen tiedot tulostetaan?");
        String joukkue = lukija.nextLine();
        
        try (Scanner tiedostonLukija = new Scanner(Paths.get(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                lista.add(tiedostonLukija.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }
        for (int i = 0 ; i < lista.size() ; i++) {
            if (lista.get(i).contains(joukkue)) {
                ottelut++;
                String rivi = lista.get(i);
                String[] palat = rivi.split(",");
                String Eka = palat[0];
                String toka = palat[1];
                int eka_p = Integer.valueOf(palat[2]);
                int toka_p = Integer.valueOf(palat[3]);
                
                if (palat[0].equals(joukkue)){
                if (eka_p > toka_p) {
                    voitot++;
                }  else{
                    tappiot++;
                }
                } else if (palat[1].equals(joukkue)) {
                    if (eka_p < toka_p){
                        voitot++;
                    } else {
                        tappiot++;
                    }
               }
            }
        }
        System.out.println("Otteluita: " + ottelut);   
        System.out.println("Voittoja: " + voitot);
        System.out.println("Tappioita: " + tappiot);
    }

}
