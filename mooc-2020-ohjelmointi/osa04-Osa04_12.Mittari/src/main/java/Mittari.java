/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oskar
 */
public class Mittari {
    private int maara;
    
public Mittari () {
    
}
public void lisaa() {
    if (maara < 5 ){
    maara = maara +1;    
    } else {
        maara = maara;
    }
}
public void vahenna() {
    if (maara > 0){
    maara = maara -1;
    } else {
        maara = 0;
    }
}
public int mitta() {
    return maara;
}
public boolean taynna() {
    if (this.maara >= 5) {
        return true;
    } 
    return false;
   
}
}