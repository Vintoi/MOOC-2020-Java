
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int summa= 0;
        System.out.println("Mihin asti");
        int luku = Integer.valueOf(lukija.nextLine());
        for (int i = 1; i <= luku; i++) {
            summa = summa + i;
            System.out.println(summa);
        }
    }
}
