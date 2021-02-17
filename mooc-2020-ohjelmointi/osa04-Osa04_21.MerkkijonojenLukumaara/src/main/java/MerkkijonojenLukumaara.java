
import java.util.Scanner;

public class MerkkijonojenLukumaara {

    public static void main(String[] args) {
        int lukuja = 0;
        
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }
            lukuja = lukuja + 1;
        }                
        System.out.println(lukuja);
    }
}
