
import java.util.ArrayList;

public class Summa {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
    ArrayList<Integer> luvut = new ArrayList<>();
    luvut.add(3);
    luvut.add(2);
    luvut.add(6);
    luvut.add(-1);
    System.out.println(summa(luvut));

    luvut.add(5);
    luvut.add(1);
    System.out.println(summa(luvut));    
    }
    public static int summa(ArrayList<Integer> luvut) {
        int koko = luvut.size();
        int summa = 0;
        while (true) {
            for (int i = 0; i < koko; i++) {
                summa = summa + luvut.get(i);
                
            }
        return summa;    
        }
        
    }

}
