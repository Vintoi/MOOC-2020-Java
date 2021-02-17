
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Lukutilasto tilasto = new Lukutilasto(); //kakkien laskeva olio
        Lukutilasto parillinen = new Lukutilasto(); //parilliset laskeva olio
        Lukutilasto pariton = new Lukutilasto(); //parittomat laskeva olio
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtävän viimeisiä osia tehdessäsi
        
        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        System.out.println("Anna lukuja:");
        while (true){
            int luku = Integer.valueOf(lukija.nextLine());
                if (luku <= -1) {
                    break;
                } else {
                    tilasto.lisaaLuku(luku);
                if (luku % 2 == 0) {
                    parillinen.lisaaLuku(luku);
                } else {
                     pariton.lisaaLuku(luku);
                }
            }
        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + parillinen.summa());
        System.out.println("Parittomien summa: " + pariton.summa());
        
    }
}
