
import java.util.Scanner;

public class SekunnitVuorokaudessa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // toteuta ohjelma tänne
        System.out.println("Kuinka monen vuorokauden sekunnit tulostetaan?");
        int pv = Integer.valueOf(lukija.nextLine());
        int sekunnit = pv * 60*60*24;
        System.out.println(sekunnit);
    }
}
