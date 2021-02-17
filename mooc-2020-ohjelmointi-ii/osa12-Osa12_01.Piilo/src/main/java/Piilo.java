
public class Piilo<T> {
    private T eka;
    
    public Piilo(){
        
    }
    public void laitaPiiloon(T piilotettava){
        this.eka = piilotettava;
    }
    public T otaPiilosta(){
        if (eka == null){
            return null;
        } else {
        return eka;
        }
    }
    public boolean onkoPiilossa() {
        if (eka == null) {
            return false;
        } else {
            return true;
        }
    }
}
