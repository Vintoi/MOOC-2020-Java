import java.util.ArrayList;

public class Tehtavalista {
    private ArrayList<String> tehtavat;
    
    public Tehtavalista(){
        tehtavat = new ArrayList<>();
    }
    public void lisaa(String tehtava){
        tehtavat.add(tehtava);
    }
    public void tulosta(){
        for (int i = 0; i < tehtavat.size() ; i++){
            System.out.println((i+1) + ": " + tehtavat.get(i));
        }
    }    
    public void poista (int numero){
        tehtavat.remove(numero - 1);
    }
}
