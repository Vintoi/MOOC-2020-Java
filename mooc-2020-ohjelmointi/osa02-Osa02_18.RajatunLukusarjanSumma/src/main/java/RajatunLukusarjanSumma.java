
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa= 0;
        System.out.println("Ensimmäinen:");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Viimeinen:");
        int toka = Integer.valueOf(lukija.nextLine());        
        for (int i = eka; i <= toka; i++) {
            summa = summa + i;
            System.out.println(summa);
        }
    }
}
