
import java.util.Scanner;

public class NegatiivistenLukujenMaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku;
        int lukuja = 0;
        while (true) {
            System.out.println("Syötä luku");
            luku = Integer.valueOf(lukija.nextLine());
            if (luku < 0) {
                lukuja++;
                continue;
            } else  if  (luku == 0) {
                break;
            } else {
                continue;
            }
        } 
        System.out.println("Negatiivisia lukuja yhteensä " + lukuja);

    }
}
