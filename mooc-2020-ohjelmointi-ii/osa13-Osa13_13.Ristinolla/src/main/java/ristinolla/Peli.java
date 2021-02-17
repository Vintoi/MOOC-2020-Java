
package ristinolla;

import javafx.scene.control.Button;

public class Peli {
    private int siirrot;
    //luodaa peli, ja aseteaan sille siirrot 0
    public Peli(){
        this.siirrot = 0;
    }
    // lisataan siirtoihin 1
    public void setVuoro(){
        this.siirrot++;
    }
    //metodi joka lopettaa pelin, jos siirtoja on 9
    public void lopeta(){
        this.siirrot = 9;
    }
    //metodi siihen, että näkee kenen vuoro on
    public String getVuoro(){
        int vuoro = this.siirrot % 2; // katsotaan siirtojen jakojaannos
        if (vuoro == 0){ // jos parillinen, palauta X
            return "X";
        } else { // jos pariton, palauta O
            return "O";
        }
    }
    // seuraavan vuoron metodi
    public String getSeuraavaVuoro(){
        if (this.siirrot >= 8){
            return "Loppu!";
        }
        if (this.getVuoro().equals("X")){ 
           return "O";
        } else {
            return "X";
        }
    }
    public boolean onkoVoitettu(Button[] napit){
        String[] ristinolla = {"X", "O"};
        
        for (String arvo : ristinolla){
            // vaakasuorat
            if (napit[0].getText().equals(arvo) && napit[1].getText().equals(arvo) && napit[2].getText().equals(arvo)){
                return true;
            }
            if (napit[3].getText().equals(arvo) && napit[4].getText().equals(arvo) && napit[5].getText().equals(arvo)){
                return true;
            }
            if (napit[6].getText().equals(arvo) && napit[7].getText().equals(arvo) && napit[8].getText().equals(arvo)){
                return true;
            }
            //pystysuorat
            if (napit[0].getText().equals(arvo) && napit[3].getText().equals(arvo) && napit[6].getText().equals(arvo)){
                return true;
            }
            if (napit[1].getText().equals(arvo) && napit[4].getText().equals(arvo) && napit[7].getText().equals(arvo)){
                return true;
            }
            if (napit[2].getText().equals(arvo) && napit[5].getText().equals(arvo) && napit[8].getText().equals(arvo)){
                return true;
            }
            //vinot
            if (napit[0].getText().equals(arvo) && napit[4].getText().equals(arvo) && napit[8].getText().equals(arvo)){
                return true;
            }
            if (napit[2].getText().equals(arvo) && napit[4].getText().equals(arvo) && napit[6].getText().equals(arvo)){
                return true;
            }            
        }
        return false;
    }   
    
}
