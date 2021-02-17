
import java.util.Scanner;

public class LukujenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luku; 
        int lukuja = 0;
        
        while (true) {
            
            System.out.println("Syötä luku");
            luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0) {
                break;
            } else {
                lukuja = lukuja +1;
                continue;
            }
        }
        System.out.println("Lukuja yhteensä " + lukuja);
    }
}
