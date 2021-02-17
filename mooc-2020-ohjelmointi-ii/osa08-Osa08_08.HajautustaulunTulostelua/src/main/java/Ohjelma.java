
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ohjelma {

    public static void main(String[] args) {
        // Testaa ohjelmasi toimintaa täällä
        HashMap<String, String> taulu = new HashMap<>();
        taulu.put("esim.", "esimerkiksi");
        taulu.put("jne.", "ja niin edelleen");
        taulu.put("yms.", "ynnä muuta sellaista");

        tulostaAvaimet(taulu);
        System.out.println("---");
        tulostaAvaimetJoissa(taulu, "m");
        System.out.println("---");
        tulostaArvotJosAvaimessa(taulu, "ne");
    }
    
    public static void tulostaAvaimet(HashMap<String, String> hajautustaulu) {
        for (String key : hajautustaulu.keySet()) {
            System.out.println(key);
        }
    }
    public static void tulostaAvaimetJoissa(HashMap<String, String> hajautustaulu, String merkkijono) {
        for (String key : hajautustaulu.keySet()) {
            if(key.contains(merkkijono)){
            System.out.println(key);
            }
        }
    }
    public static void tulostaArvotJosAvaimessa(HashMap<String, String> hajautustaulu, String merkkijono) {
        Set<HashMap.Entry<String, String>> entries = hajautustaulu.entrySet();
        
        for (HashMap.Entry<String, String> entry: entries){
            if (entry.getKey().contains(merkkijono)){
            System.out.println(entry.getValue());
            }
        }
        
        /*if (hajautustaulu.containsKey(merkkijono)){
        hajautustaulu.forEach((key, value) -> {
            System.out.println(value);
        });
        }*/
    }

}
