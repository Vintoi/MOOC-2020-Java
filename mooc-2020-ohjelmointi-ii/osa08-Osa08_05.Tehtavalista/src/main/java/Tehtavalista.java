
import java.util.ArrayList;


public class Tehtavalista {
    private ArrayList<String> lista;
    
    public Tehtavalista(){
        this.lista = new ArrayList<>();
    }
    public void lisaa(String tehtava) {
        lista.add(tehtava);
    }
    public void tulosta(){
        if (lista.isEmpty()){
        } else {
            for (int i = 0 ; i < lista.size() ; i++){
                System.out.println(i+1 + ": " + lista.get(i));
            }
        }
    }
    public void poista(int numero) {
        lista.remove(numero-1);
    }
}
