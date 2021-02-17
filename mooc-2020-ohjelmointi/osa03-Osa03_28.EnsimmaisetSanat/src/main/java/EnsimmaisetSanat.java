
import java.util.Scanner;

public class EnsimmaisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
        String mjono = lukija.nextLine();
            if (mjono.equals("")) {
                break;
            } else {
                String[] osat = mjono.split(" ");
                for (int i = 0; i < 1; i++) {
                    System.out.println(osat[i]);
                }
            }
        }
    }
}
