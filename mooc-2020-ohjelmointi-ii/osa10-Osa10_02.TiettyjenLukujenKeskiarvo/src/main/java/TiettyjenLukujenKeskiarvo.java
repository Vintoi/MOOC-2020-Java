
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> luvut = new ArrayList<>();
        // toteuta ohjelmasi tänne
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("loppu")){
                break;
            } 
                luvut.add(syote);
            }
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        while (true) {
            String syote = lukija.nextLine();
            if (syote.equals("n")) {
                double nKeskiarvo = luvut.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku < 0)
                    .average()
                    .getAsDouble();
                    System.out.println("Negatiivisten lukujen keskiarvo: " + nKeskiarvo);
                    break;
            } else if (syote.equals("p")) {
                double pKeskiarvo = luvut.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(luku -> luku > 0)
                    .average()
                    .getAsDouble();
                    System.out.println("Positiivisten lukujen keskiarvo: " + pKeskiarvo);
                    break;
            }
        }
    }
}
        
            
        