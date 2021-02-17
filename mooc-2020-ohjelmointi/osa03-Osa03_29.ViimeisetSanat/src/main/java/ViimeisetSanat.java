
import java.util.Scanner;

public class ViimeisetSanat {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        while (true) {
        String mjono = lukija.nextLine();
            if (mjono.equals("")) {
                break;
            } else {
                String[] osat = mjono.split(" ");
                for (int i = 0; i < osat.length ; i++) {
                    if (i+1 == osat.length) {
                        System.out.println(osat[i]);
                    }
                }
            }
        }
    }
}