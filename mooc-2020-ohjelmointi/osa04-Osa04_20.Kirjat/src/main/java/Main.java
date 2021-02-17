
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // toteuta tänne toiminnallisuus, jonka avulla käyttäjä voi syöttää
        // kirjoja sekä tarkastella niitä
        ArrayList<Kirja> kirjat = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.println("Nimi");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break; 
            }
            System.out.println("Sivuja");
            int sivuja = Integer.valueOf(lukija.nextLine());
            System.out.println("Julkaisuvuosi");
            int julkaisuv = Integer.valueOf(lukija.nextLine());            

            kirjat.add(new Kirja(nimi, sivuja, julkaisuv));
        }
        
        System.out.println("Mitä tulostetaan? ");
        String mita = lukija.nextLine();
        for (int i = 0; i < kirjat.size(); i++) {
            if (mita.equals("kaikki")) {
                System.out.println(kirjat.get(i));
            } else if (mita.equals("nimi")) {
                System.out.println(kirjat.get(i).getNimi());
            } 
        }
    }
}
