
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa= 1;
        System.out.println("Ensimmäinen:");
        int eka = Integer.valueOf(lukija.nextLine());
        for (int i = 1; i <= eka; i++) {
            summa = summa * i;
            
        }
        System.out.println("Kertoma on" + summa);
    }
}
