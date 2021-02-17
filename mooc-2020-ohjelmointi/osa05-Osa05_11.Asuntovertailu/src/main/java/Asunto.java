
public class Asunto {

    private int huoneita;
    private int nelioita;
    private int neliohinta;

    public Asunto(int huoneita, int nelioita, int neliohinta) {
        this.huoneita = huoneita;
        this.nelioita = nelioita;
        this.neliohinta = neliohinta;
    }
    public boolean suurempi(Asunto verrattava) {
        if (this.nelioita > verrattava.getNeliot()) {
            return true;
        } else {
            return false;
        }
    }
    public int hintaero(Asunto verrattava) {
        if (this.getHinta() > verrattava.getHinta()){
            return this.getHinta() - verrattava.getHinta();
        } else {
        return verrattava.getHinta() - this.getHinta();
    }
    }
    
    public boolean kalliimpi(Asunto verrattava) {
        if (this.getHinta() > verrattava.getHinta()){
            return true;
        } else {
            return false;
        }
    }
     
    public int getNeliot(){
        return this.nelioita;
    }
    public int getHinta(){
        return this.nelioita*this.neliohinta;
    }
    
}
