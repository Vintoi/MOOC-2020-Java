
import java.util.ArrayList;
import java.util.Collections;


public class Kasi implements Comparable<Kasi> {
    private ArrayList<Kortti> kortit;
    
    public Kasi(){
        this.kortit = new ArrayList<>();
    }
    public void lisaa(Kortti kortti){
        this.kortit.add(kortti);

    }
    public void tulosta(){
        kortit.stream()
            .forEach(kortti -> System.out.println(kortti));
    }
    public void jarjesta(){
        Collections.sort(kortit);
    }

    public ArrayList<Kortti> getKortit() {
        return kortit;
    }

    public void setKortit(ArrayList<Kortti> kortit) {
        this.kortit = kortit;
    }


  
    @Override
    public int compareTo(Kasi k) {
        int yht = 0;      
        for (int i = 0 ; i < kortit.size(); i++){
            yht = yht + kortit.get(i).getArvo();
        }
        int verrattava = 0;
        for (int i = 0; i < k.getKortit().size() ; i++){
            verrattava = verrattava + k.getKortit().get(i).getArvo();
        }
        
        if (yht == verrattava) {
            return 0;
        } else if (yht > verrattava) {
            return 1;
        } else {
            return -1;
        }
    }
    public void jarjestaMaittain() {
        this.kortit.sort(new SamatMaatVierekkainArvojarjestykseen());
    }

    
    
}
