
import java.util.Scanner;

public class KolmellaJaolliset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        kolmellaJaollisetValilta(3,6);
    }
    
    public static void kolmellaJaollisetValilta(int alku, int loppu) {
        for (int i = alku ; i <= loppu; i++) {
            if ( i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
