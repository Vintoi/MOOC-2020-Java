
public class Opiskelija extends Henkilo {
    private int op;
    
    public Opiskelija (String nimi, String osoite){
        super(nimi, osoite);
        this.op = 0;
    }
    public void opiskele(){
        this.op = this.op + 1;
    }
    public int opintopisteita(){
        return this.op;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\n" + "  opintopisteitä " + this.op;
    }
    
}
