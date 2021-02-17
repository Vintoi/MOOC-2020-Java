
import java.util.ArrayList;

public class Huone {
    private ArrayList<Henkilo> henkilot;
    
    public Huone(){
        this.henkilot = new ArrayList<>();
    }
    public void lisaa(Henkilo henkilo){
        henkilot.add(henkilo);
    }
    public boolean onTyhja(){
        if (henkilot.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
    public ArrayList<Henkilo> getHenkilot(){
        return (henkilot);
    }
    public Henkilo lyhin(){
        if (henkilot.isEmpty()) {
            return null;
        } else {
            int min = henkilot.get(0).getPituus();
            Henkilo lyhyin = henkilot.get(0);
            for (int i = 0; i < henkilot.size(); i++) {
                if (min > henkilot.get(i).getPituus()) {
                    min = henkilot.get(i).getPituus();
                    lyhyin = henkilot.get(i);
                } 
            }
            return lyhyin;
        }
    }
    public Henkilo ota(){
        if (henkilot.isEmpty()) {
            return null;
        } else {
            int min = henkilot.get(0).getPituus();
            Henkilo lyhyin = henkilot.get(0);
            
            for (int i = 0; i < henkilot.size(); i++) {
                if (min > henkilot.get(i).getPituus()) {
                    min = henkilot.get(i).getPituus();
                    lyhyin = henkilot.get(i);
                }
            }
            for (int i = 0; i < henkilot.size(); i++) {
                if (lyhyin.getNimi().equals(henkilot.get(i).getNimi())){
                    henkilot.remove(henkilot.get(i));
                }
            }
            return lyhyin;
        }        
    }
}
