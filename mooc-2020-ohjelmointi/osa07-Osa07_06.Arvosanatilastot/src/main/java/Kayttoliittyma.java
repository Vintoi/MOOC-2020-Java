import java.util.Scanner;
 
public class Kayttoliittyma {
 
    private Arvosanarekisteri rekisteri;
    private Scanner lukija;
 
    public Kayttoliittyma(Arvosanarekisteri rekisteri, Scanner lukija) {
        this.rekisteri = rekisteri;
        this.lukija = lukija;
    }  
  
     public void kaynnista() {
        luePisteet();
    }
     public void luePisteet() {
        System.out.println("Syötä yhteispisteet, -1 lopettaa:"); 
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("-1")) {
                System.out.println("Pisteiden keskiarvo (kaikki): " + rekisteri.Keskiarvo());
                System.out.println("Pisteiden keskiarvo (hyväksytyt): " + rekisteri.hyvaksytytKA());
                System.out.println("Hyväksymisprosentti: " + rekisteri.hyvaksyntaprosentti());
                System.out.println("Arvosanajakauma:");
                tulostaArvosanajakauma();
                break;
            }
            int pisteet = Integer.valueOf(luettu);
            if (pisteet < 0 || pisteet > 100) {
                continue;
            }
            if (pisteet > 0 || pisteet <= 100) {
                rekisteri.lisaaPisteet(pisteet);
            }
            if (pisteet >= 50 && pisteet <= 100) {
                rekisteri.lisaaHyvaksytyt(pisteet);
            }
        }
        }
         public static void tulostaTahtia(int tahtia) {
        while (tahtia > 0) {
            System.out.print("*");
            tahtia--;
        }
    }
      public void tulostaArvosanajakauma() {
        int arvosana = 5;
        while (arvosana >= 0) {
            int tahtia = rekisteri.montakoSaanutArvosanan(arvosana);
            System.out.print(arvosana + ": ");
            tulostaTahtia(tahtia);
            System.out.println("");
 
            arvosana = arvosana - 1;
        }
    }
 

   }