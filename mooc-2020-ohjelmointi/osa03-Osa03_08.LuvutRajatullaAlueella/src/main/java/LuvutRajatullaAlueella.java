
import java.util.ArrayList;
import java.util.Scanner;

public class LuvutRajatullaAlueella {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        System.out.println("Mistä: ");
        int eka = Integer.valueOf(lukija.nextLine());
        System.out.println("Mihin: ");
        int toka = Integer.valueOf(lukija.nextLine());
        int koko = luvut.size();
        for (int i = eka; i <= toka; i++) {
            if (i == koko) {
                break;
            }else {
                System.out.println(luvut.get(i));
            }
        }
    }
}
