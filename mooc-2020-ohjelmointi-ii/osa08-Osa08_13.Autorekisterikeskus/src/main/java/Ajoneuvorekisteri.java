
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Ajoneuvorekisteri {
    private HashMap<Rekisterinumero, String> omistajat;
    
    public Ajoneuvorekisteri(){
        omistajat = new HashMap<>();
}
    public boolean lisaa(Rekisterinumero rekkari, String omistaja) {
        if(omistajat.containsKey(rekkari)) {
            return false;
        } else {
        omistajat.put(rekkari, omistaja);
            return true;
        }
    }
    
    public String hae(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)){
        return omistajat.get(rekkari);
        } else {
            return null;
        }
    }
    
    public boolean poista(Rekisterinumero rekkari) {
        if (omistajat.containsKey(rekkari)){
            omistajat.remove(rekkari);
            return true;
        } else {
            return false;
        }
    }
    public void tulostaRekisterinumerot(){
        for (Rekisterinumero rekkari : omistajat.keySet()) {
            System.out.println(rekkari.getRekkari());
        }
    }
    public void tulostaOmistajat(){
        /*
        Set<String> names = new HashSet<>(omistajat.values());
        System.out.println(names);
        */
        ArrayList<String> buffer = new ArrayList<String>();
            String toAdd = "";
        
        for(Rekisterinumero i : this.omistajat.keySet()){
            //System.out.println(this.db.get(i));
            toAdd = this.omistajat.get(i);
            if(buffer.contains(toAdd)){
                
            } else {
                buffer.add(toAdd);
            }
        }
        
        for (int k = 0; k < buffer.size() ; k++) {
            System.out.println(buffer.get(k));
        }
        
        
    }
}



