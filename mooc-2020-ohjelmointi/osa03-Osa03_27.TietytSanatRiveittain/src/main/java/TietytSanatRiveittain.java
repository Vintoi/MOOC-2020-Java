
import java.util.Scanner;

public class TietytSanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
        String mjono = lukija.nextLine();
            if (mjono.equals("")) {
                break;
            }
            
            String[] osat = mjono.split(" ");
            for (String osa : osat) {
                if (osa.contains("av")) {
                    System.out.println(osa);
                }
            }
                
            
        }
    }
}