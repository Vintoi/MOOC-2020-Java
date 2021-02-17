
import java.util.Scanner;

public class Lahjaverolaskuri {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.println("Lahjan suuruus?");
        int luku = Integer.valueOf(lukija.nextLine());
        
        if (luku >= 5000 && luku < 25000){
            double vero = (1.0* 100+(luku-5000)*0.08);
            System.out.println("Vero: " + vero);
        } else if (luku >= 25000 && luku < 55000){
            double vero = (1.0* 1700 + (luku-25000)*0.10);
            System.out.println("Vero: " + vero);
        } else if (luku >= 55000 && luku < 200000){
            double vero = (1.0* 4700 + (luku-55000)*0.12);
            System.out.println("Vero: " + vero);
        } else if (luku >= 200000 && luku < 1000000){
            double vero = (1.0* 22100+(luku-200000)*0.15);
            System.out.println("Vero: " + vero);
        } else if (luku >= 1000000){
            double vero = (1.0* 142100+(luku-1000000)*0.17);
            System.out.println("Vero: " + vero);
        } else {
            System.out.println("Ei veroa!");
        }
    }
}