
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Tee sovelluksesi tänne -- kannattaa harkita sovelluksen pilkkomista
        // useampaan luokkaan.
        
        Arvosanarekisteri rekisteri = new Arvosanarekisteri();
        Kayttoliittyma liittyma = new Kayttoliittyma(rekisteri, lukija);
        
        liittyma.kaynnista();
    }
}
