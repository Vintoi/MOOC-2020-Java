
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Kirja> kirjat = new ArrayList<>();
        
        while (true){
            System.out.println("Syötä kirjan nimi, tyhjä lopettaa:");
            String syote = lukija.nextLine();
            if(syote.equals("")){
                break;
            } else {
                System.out.println("Syötä kirjan pienin kohdeikä:");
                String ika = lukija.nextLine();
                kirjat.add(new Kirja(syote,Integer.valueOf(ika)));
            }
        }
        System.out.println("Yhteensä " + kirjat.size() + " kirjaa");
        
        Comparator<Kirja> vertailija = Comparator
                .comparing(Kirja::getIka)
                .thenComparing(Kirja::getNimi);
        
        Collections.sort(kirjat, vertailija);
        
        kirjat.stream()
                .forEach(kirja -> System.out.println(kirja));
    }

}
