
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        int summa= 0;
        int lukuja = 0;
        int parittomia = 0;
        int pari= 0;   
        System.out.println("Syötä luvut:");
        while (true) {
            int eka = Integer.valueOf(lukija.nextLine());
            if (eka == -1) {
                System.out.println("Kiitos ja näkemiin!");
                break;
            } else if (eka % 2 == 0) {
                summa = summa + eka;
                pari++;
                lukuja++;   
                continue;
            } else {
                summa = summa + eka;
                parittomia++;
                lukuja++;    
                continue;
            }
        }
        double ka = 1.0 * summa / lukuja;
        System.out.println("Summa " + summa);
        System.out.println("Lukuja " + lukuja);
        System.out.println("Keskiarvo " + ka);  
        System.out.println("Parillisia " + pari);
        System.out.println("Parittomia " + parittomia);
    }
}
