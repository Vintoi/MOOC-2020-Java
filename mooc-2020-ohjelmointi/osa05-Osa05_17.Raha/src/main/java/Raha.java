
public class Raha {

    private final int euroa;
    private final int senttia;

    public Raha(int euroa, int senttia) {

        if (senttia > 99) {
            euroa = euroa + senttia / 100;
            senttia = senttia % 100;
        }

        this.euroa = euroa;
        this.senttia = senttia;
    }

    public int eurot() {
        return this.euroa;
    }

    public int sentit() {
        return this.senttia;
    }

    public String toString() {
        String nolla = "";
        if (this.senttia < 10) {
            nolla = "0";
        }

        return this.euroa + "." + nolla + this.senttia + "e";
    }
    
    public Raha plus(Raha lisattava) {
        Raha uusi = new Raha (this.euroa + lisattava.eurot(), this.senttia + lisattava.sentit() );
        return uusi;
    }
    public boolean vahemman(Raha verrattava) {
            if(this.euroa == verrattava.eurot() && this.senttia < verrattava.sentit()) {
                return true;
            } else  if (this.euroa < verrattava.eurot() ){
                return true;
            } else {
                return false;
            }
    }
    public Raha miinus(Raha vahentaja) {
        if (this.senttia == 0){
            int tempEuro = this.euroa - 1 - vahentaja.eurot();
            int tempSentit = 100 - vahentaja.sentit();
            
            if (tempEuro < 0 && tempSentit < 0) {
            Raha uusi = new Raha(0,0);
            return uusi;
        } else if (tempEuro == 0 && tempSentit < 0){
            Raha uusi = new Raha(0,0);
            return uusi;
        } else if (tempEuro < 0) {
            Raha uusi = new Raha(0,0);
            return uusi;
        } else {
            Raha uusi = new Raha(tempEuro,tempSentit);
            return uusi;
        }
        } else if (this.senttia - vahentaja.sentit() < 0){
            int tempEuro = this.euroa -2 - vahentaja.eurot();
            int tempSentit = 100 -(this.senttia - vahentaja.sentit());
            
            if (tempEuro < 0 && tempSentit < 0) {
            Raha uusi = new Raha(0,0);
            return uusi;
        } else if (tempEuro == 0 && tempSentit < 0){
            Raha uusi = new Raha(0,0);
            return uusi;
        } else if (tempEuro < 0) {
            Raha uusi = new Raha(0,0);
            return uusi;
        } else {
            Raha uusi = new Raha(tempEuro,tempSentit);
            return uusi;
        }
        } else {
        int tempEuro = this.euroa - vahentaja.eurot();
        int tempSentit = this.senttia - vahentaja.sentit();
        if (tempEuro < 0 && tempSentit < 0) {
            Raha uusi = new Raha(0,0);
            return uusi;
        } else if (tempEuro == 0 && tempSentit < 0){
            Raha uusi = new Raha(0,0);
            return uusi;
        } else if (tempEuro < 0) {
            Raha uusi = new Raha(0,0);
            return uusi;
        } else {
            Raha uusi = new Raha(tempEuro,tempSentit);
            return uusi;
        }
        }
    }
    
}
