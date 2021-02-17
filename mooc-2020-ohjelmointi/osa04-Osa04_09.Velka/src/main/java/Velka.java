
public class Velka {
    private double velka;
    private double korko;
    
    public Velka(double saldoAlussa, double korkokerroinAlussa) {
        this.velka = saldoAlussa;
        this.korko = korkokerroinAlussa;
        
    }
    public void tulostaSaldo() {
        System.out.println(velka);
    }
    public void odotaVuosi(){
        this.velka = velka * korko;
    }
}
