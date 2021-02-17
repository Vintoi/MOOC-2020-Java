
public class Elokuva {
    private String e_nimi;
    private int e_ikaraja;
    
public Elokuva(String elokuvanNimi, int elokuvanIkaraja) {
    this.e_nimi = elokuvanNimi;
    this.e_ikaraja = elokuvanIkaraja;
    
}   
public String nimi(){
    return e_nimi;
}
public int ikaraja() {
    return e_ikaraja;
}
}
