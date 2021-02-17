
public class Laskuri {
    private int arvo;
    
public Laskuri(int alkuarvo) {
    this.arvo = alkuarvo;
}    
public Laskuri() {
    this.arvo = 0;
}
public int arvo(){
    return this.arvo;
}
public void lisaa() {
    this.arvo = this.arvo + 1;
    
}
public void vahenna() {
    this.arvo = this.arvo -1;
}
public void vahenna(int vahennys) {
    if (vahennys < 0){
        this.arvo = this.arvo;
    } else {
    this.arvo = this.arvo - vahennys;
    }
}
public void lisaa(int lisays) {
    if (lisays <= 0) {
        this.arvo = this.arvo;
    } else {
    this.arvo = this.arvo + lisays;
    }
}
}
