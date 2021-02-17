public class Maksukortti {
    private double saldo;

    public Maksukortti(double alkusaldo) {
        this.saldo = alkusaldo ;// kirjoita koodia tähän
    }
    
    public void lataaRahaa(double rahamaara) {
    // kirjoita koodia tähän
        if (rahamaara < 0) {
            saldo = saldo;
        } else if (saldo + rahamaara > 150 ){
            saldo = 150;
        } else {
        saldo = saldo + rahamaara;
        }
    }    
    public void syoEdullisesti() {
    // kirjoita koodia tähän
        if (saldo < 2.60) {
            saldo = saldo;
        } else {
        saldo = saldo - 2.60;
        }
    }

    public void syoMaukkaasti() {
    // kirjoita koodia tähän
        if (saldo < 4.60 ){
            saldo = saldo;
        } else {
        saldo = saldo - 4.60;
        }
    }

    public String toString() {
        // kirjoita koodia tähän
        return "Kortilla on rahaa " + saldo +" euroa";
    }
}