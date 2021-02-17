import java.util.ArrayList;
 
public class Arvosanarekisteri {
 
    private ArrayList<Integer> arvosanat;
    private ArrayList<Integer> koepisteet;
    private ArrayList<Integer> hyvaksytyt;
 
    public Arvosanarekisteri() {
        this.arvosanat = new ArrayList<>();
        this.koepisteet = new ArrayList<>();
        this.hyvaksytyt = new ArrayList<>();
    }
    public void lisaaPisteet(int piste){
        this.koepisteet.add(piste);
        this.arvosanat.add(pisteetArvosanaksi(piste));
    }
    public void lisaaHyvaksytyt(int piste){
        this.hyvaksytyt.add(piste);
    }
    
    public double Keskiarvo(){
        if(koepisteet.isEmpty()){
            return -1;
        } else {
        int yht = 0;
        for (int i = 0 ; i < koepisteet.size() ; i++) {
            yht = yht + koepisteet.get(i);
        }
        return 1.0 * yht / koepisteet.size();
        }
    }
        public double hyvaksytytKA(){
        if(hyvaksytyt.isEmpty()){
            return -1;
        } else {
        int yht = 0;
        for (int i = 0 ; i < hyvaksytyt.size() ; i++) {
            yht = yht + hyvaksytyt.get(i);
        }
        return 1.0 * yht / hyvaksytyt.size();
        }
    }
    public double hyvaksyntaprosentti() {
        return 100.0* hyvaksytyt.size() / koepisteet.size();
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
    
}
