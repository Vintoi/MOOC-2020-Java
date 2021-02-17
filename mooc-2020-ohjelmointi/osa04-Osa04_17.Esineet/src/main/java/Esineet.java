
import java.util.ArrayList;
import java.util.Scanner;

public class Esineet {

    public static void main(String[] args) {
        // toteuta luokkaa Henkilotieto käyttävä ohjelmasi tänne

        ArrayList<Esine> esineet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Nimi: ");
            String osa = lukija.nextLine();
        if (osa.isEmpty()) {
            break;
        } else {
            esineet.add(new Esine(osa));
        }
        }
        for (int i = 0; i < esineet.size(); i++) {
            System.out.println(esineet.get(i));
        }
    }
}