import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> mJonot = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            } else {
                mJonot.add(luettu);
            }
            
        }
        mJonot.stream()
           .forEach(mjono -> System.out.println(mjono));
    }
}
