
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Tyontekijat {
    private ArrayList<Henkilo> henkilot;
    
    public Tyontekijat(){
        henkilot = new ArrayList<>();
    }
    public void lisaa(Henkilo lisattava){
        henkilot.add(lisattava);
    }
    public void lisaa(List<Henkilo> lisattavat){
        for (int i = 0; i< lisattavat.size() ; i++){
            henkilot.add(lisattavat.get(i));
        }
    }
    public void tulosta() {
        henkilot.stream()
                .forEach(henkilo -> System.out.println(henkilo));
    }
    public void tulosta(Koulutus koulutus){
        
        Iterator<Henkilo> iteraattori = henkilot.iterator();
        while(iteraattori.hasNext()){
            Henkilo seuraava = iteraattori.next();
            if(seuraava.getKoulutus() == koulutus){
            System.out.println(seuraava);
            }
        }
        /*
        for (int i = 0; i < this.henkilot.size() ; i++) {
            if(henkilot.get(i).getKoulutus() == koulutus){
                System.out.println(henkilot.get(i));
            } 
        }
        */
    }
    public void irtisano(Koulutus koulutus) {
        
        Iterator<Henkilo> iteraattori = this.henkilot.iterator();
        while(iteraattori.hasNext()){
            if(iteraattori.next().getKoulutus()==koulutus){
                iteraattori.remove();
            }
        }
    }
}
