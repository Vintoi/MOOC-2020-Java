
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        // Tee tehtävänannossa pyydetyt operaatiot täällä!
        HashMap<String,String> lempinimet = new HashMap<>();
        lempinimet.put("Matti", "mage");
        lempinimet.put("Mikael", "mixu");
        lempinimet.put("Arto", "arppa");
        
        System.out.println(lempinimet.get("Mikael"));
    }

}
