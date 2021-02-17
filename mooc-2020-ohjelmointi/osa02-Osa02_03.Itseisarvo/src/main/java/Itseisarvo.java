
import java.util.Scanner;

public class Itseisarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int eka = Integer.valueOf(lukija.nextLine());
        if (eka > 0) {
            System.out.println(eka);
        
        } else {
            eka = -1 * eka;
            System.out.println(eka);
        }
    }
}