
import java.util.ArrayList;
import java.util.Collections;

public class Taikanelio {

    private int[][] nelio;

    // valmis konstruktori
    public Taikanelio(int koko) {
        if (koko < 2) {
            koko = 2;
        }

        this.nelio = new int[koko][koko];
    }

    // toteuta nämä kolme metodia
    public ArrayList<Integer> rivienSummat() {
        ArrayList<Integer> luvut = new ArrayList<>();
        
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            int luku = 0;
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
            luku = luku + nelio[rivi][sarake];
            }
            luvut.add(luku);
        }
        return luvut;
    }

    public ArrayList<Integer> sarakkeidenSummat() {
        ArrayList<Integer> sarakkeet = new ArrayList<>();
        for(int sarake = 0; sarake < nelio.length; sarake++){
            int luku = 0;
            for (int rivi = 0; rivi < nelio.length; rivi++){
                luku = luku + nelio[rivi][sarake];
            }
            sarakkeet.add(luku);
        }
        return sarakkeet;
    }

    public ArrayList<Integer> lavistajienSummat() {
        ArrayList<Integer> lavistajienSummat = new ArrayList<>();
        int laskevaRivi = nelio.length - 1;
        
        for (int lavistaja = 0; lavistaja < 2; lavistaja++) {
            
            int summa = 0;
            for (int rivit = 0; rivit < nelio.length; rivit++) {
                
                if(!lavistajienSummat.isEmpty()) {
                    summa += nelio[laskevaRivi][rivit];
                    laskevaRivi--;
                } else {      
                    summa += nelio[rivit][rivit];
                }
            }
            lavistajienSummat.add(summa);
        }
        
        return lavistajienSummat;
    }

    // valmiit apumetodit -- älä koske näihin
    public boolean onTaikanelio() {
        return summatSamat() && kaikkiNumerotEri();
    }

    public ArrayList<Integer> annaKaikkiNumerot() {
        ArrayList<Integer> numerot = new ArrayList<>();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                numerot.add(nelio[rivi][sarake]);
            }
        }

        return numerot;
    }

    public boolean kaikkiNumerotEri() {
        ArrayList<Integer> numerot = annaKaikkiNumerot();

        Collections.sort(numerot);
        for (int i = 1; i < numerot.size(); i++) {
            if (numerot.get(i - 1) == numerot.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean summatSamat() {
        ArrayList<Integer> summat = new ArrayList<>();
        summat.addAll(rivienSummat());
        summat.addAll(sarakkeidenSummat());
        summat.addAll(lavistajienSummat());

        if (summat.size() < 3) {
            return false;
        }

        for (int i = 1; i < summat.size(); i++) {
            if (summat.get(i - 1) != summat.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int annaArvo(int x, int y) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return - 1;
        }

        return this.nelio[y][x];
    }

    public void asetaArvo(int x, int y, int arvo) {
        if (x < 0 || y < 0 || x >= getLeveys() || y >= getKorkeus()) {
            return;
        }

        this.nelio[y][x] = arvo;
    }

    public int getLeveys() {
        return this.nelio.length;
    }

    public int getKorkeus() {
        return this.nelio.length;
    }

    @Override
    public String toString() {
        StringBuilder palautus = new StringBuilder();
        for (int rivi = 0; rivi < nelio.length; rivi++) {
            for (int sarake = 0; sarake < nelio[rivi].length; sarake++) {
                palautus.append(nelio[rivi][sarake]).append("\t");
            }

            palautus.append("\n");
        }

        return palautus.toString();
    }
}
