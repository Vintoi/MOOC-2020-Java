
import java.util.ArrayList;

public class Arvosanarekisteri {

    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> pisteet;

    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.pisteet = new ArrayList<>();
    }

    public void lisaaArvosanaPisteidenPerusteella(int pisteet) {
        this.pisteet.add(pisteet);
        this.arvosanat.add(pisteetArvosanaksi(pisteet));
    }

    public int montakoSaanutArvosanan(int arvosana) {
        int lkm = 0;
        for (int saatu : this.arvosanat) {
            if (saatu == arvosana) {
                lkm++;
            }
        }

        return lkm;
    }

    public static int pisteetArvosanaksi(int pisteet) {

        int arvosana = 0;
        if (pisteet < 50) {
            arvosana = 0;
        } else if (pisteet < 60) {
            arvosana = 1;
        } else if (pisteet < 70) {
            arvosana = 2;
        } else if (pisteet < 80) {
            arvosana = 3;
        } else if (pisteet < 90) {
            arvosana = 4;
        } else {
            arvosana = 5;
        }

        return arvosana;
    }
    
    public double arvosanojenKeskiarvo(){
        if (arvosanat.isEmpty()) {
            return -1.0;
        } else {
            int yht = 0;
            for (int i = 0; i < arvosanat.size(); i++){
                yht = yht + arvosanat.get(i);
                
            }
            return 1.0* yht / arvosanat.size();
        }
    }
    
    
    public double koepisteidenKeskiarvo() {
        if (pisteet.isEmpty()) {
            return -1.0;
        } else {
            int yht = 0;
            for (int i = 0; i < pisteet.size(); i++){
                yht = yht + pisteet.get(i);
                
            }
            return 1.0* yht / pisteet.size();
        }
    }
    
}
