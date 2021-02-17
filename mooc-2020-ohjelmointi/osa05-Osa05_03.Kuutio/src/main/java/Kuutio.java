
public class Kuutio {
    private int pituus;
    
public Kuutio(int sarmanPituus) {
    this.pituus = sarmanPituus;
}    
public int tilavuus(){
    return pituus*pituus*pituus;
}
@Override
public String toString() {
    return "Kuution särmän pituus on " + pituus + ", tilavuus on " + tilavuus();
}
}
