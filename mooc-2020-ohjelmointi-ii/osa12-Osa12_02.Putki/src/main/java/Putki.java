
import java.util.ArrayList;


public class Putki<T> {
    private ArrayList<T> lista;
    
    public Putki(){
        this.lista = new ArrayList<>();
    }
    
    public void lisaaPutkeen(T arvo){
        this.lista.add(arvo);
    }
    public T otaPutkesta(){
        if (lista.isEmpty()){
            return null;
        } else {
            T arvo = lista.get(0);
            this.lista.remove(arvo);
            return arvo;
        }
    }
    
    public boolean onkoPutkessa(){
        if(this.lista.isEmpty()){
            return false;
        } else {
            return true;
        }
    }
}

