
import java.util.ArrayList;

public class PoistaViimeinen {

    public static void main(String[] args) {
        // kokeile toteuttamasi metodin toimintaa täällä
        ArrayList<String> merkkijonot = new ArrayList<>();

        merkkijonot.add("Eka");
        merkkijonot.add("Toka");
        merkkijonot.add("Kolmas");

        System.out.println(merkkijonot);
        
        poistaViimeinen(merkkijonot);
        System.out.println(merkkijonot);
    }   
    public static void poistaViimeinen(ArrayList<String> mjonot) {
        int koko = mjonot.size();
        String mjono = " ";
        if (mjonot != null && !mjonot.isEmpty()) {
            mjonot.remove(koko-1);
        }
        
    }

}
