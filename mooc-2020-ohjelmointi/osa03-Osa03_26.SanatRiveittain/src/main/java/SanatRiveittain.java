
import java.util.Scanner;

public class SanatRiveittain {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
        String mjono = lukija.nextLine();
            if (mjono.equals("")) {
                break;
            }
            
            String[] osat = mjono.split(" ");
            for (String osa : osat) {
                System.out.println(osa);
            }
        }

    }
}