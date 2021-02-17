
import java.util.Scanner;

public class PositiivistenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int luvut = 0;
        int yht = 0;
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == 0){
                System.out.println("keskiarvon laskeminen ei ole mahdollista");
                break;
            } 
            if (luku < 0) {
                yht = yht;
                luvut = luvut;
            } else {
                luvut = luvut + 1;
                yht = yht + luku;
            }
        }
        double ka = 1.0 * yht / luvut;
        System.out.println(ka);
    }
}
