
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lukuja = 0;
        double ka;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            } else if (luku < 0) {
                continue;
            } else {
                summa = summa + luku;
                lukuja++;
                continue;
            }
        }
        if (lukuja == 0) {
            System.out.println("keskiarvon laskeminen ei ole mahdollista");
        } else {
            ka = 1.0* summa / lukuja;
            System.out.println(ka);
        }
    }
}
