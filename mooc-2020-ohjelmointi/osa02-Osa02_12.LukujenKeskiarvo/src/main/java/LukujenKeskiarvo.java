
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa = 0;
        int lukuja = 0;
        double ka = 0;
        while (true) {
            System.out.println("Syötä luku");
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            
            } else {
                summa = summa + luku;
                lukuja++;
                continue;
            }
        }
        ka = (1.0 * summa) / lukuja;
        System.out.println("Lukujen keskiarvo " + ka);

    }
}