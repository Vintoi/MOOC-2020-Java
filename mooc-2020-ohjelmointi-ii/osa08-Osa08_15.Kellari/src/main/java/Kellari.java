import java.util.ArrayList;
import java.util.HashMap;

public class Kellari {
    private HashMap<String, ArrayList<String>> komerot;
    
    public Kellari(){
        komerot = new HashMap<>();
    }
    
    public void lisaa(String komero, String tavara) {
        this.komerot.putIfAbsent(komero, new ArrayList<>());
        
        ArrayList<String> tavarat = this.komerot.get(komero);
        
        tavarat.add(tavara);
    }
    public ArrayList<String> sisalto(String komero) {
        if (this.komerot.containsKey(komero)) {
            return this.komerot.get(komero);
        } else {
            ArrayList<String> uusi = new ArrayList<>();
            return uusi;
        }
    }
    public void poista(String komero, String tavara) {
        if (this.komerot.containsKey(komero)) {
            ArrayList<String> tavarat = this.komerot.get(komero);
            tavarat.remove(tavara);
        }
        
    }

    public ArrayList<String> komerot() {
      ArrayList<String> uusi = new ArrayList<>();
      for (String nimi : komerot.keySet()) {
          if(this.komerot.get(nimi).isEmpty()) {
              
          }else {
          uusi.add(nimi);
          }
      }
      return uusi;
     
    }
}
