
import java.util.ArrayList;
import java.util.Scanner;

public class KysytynLuvunIndeksi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        while (true) {
            int luettu = Integer.valueOf(lukija.nextLine());
            if (luettu == -1) {
                break;
            }

            lista.add(luettu);
        }

        System.out.println("");

        // toteuta tänne toiminnallisuus luvun etsimiseen
        int koko = lista.size();
        System.out.println("Mitä etsitään? ");
        int eka = Integer.valueOf(lukija.nextLine());
        for (int i = 0; i < koko ; i++ ) {
            int luku = lista.get(i);
            if (eka == luku) {
                System.out.println("Luku " + eka + " on indeksissä " + i);
            }
        }
    }
}
