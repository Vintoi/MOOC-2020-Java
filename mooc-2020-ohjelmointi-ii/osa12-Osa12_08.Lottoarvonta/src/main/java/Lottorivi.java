
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;
    private Random random;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        random = new Random();
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        // Alustetaan lista numeroille
        this.numerot = new ArrayList<>();
        int ylaraja = 7;
        for (int i = 0; i < ylaraja; i++){
            int numero = random.nextInt(40) + 1;
            if(sisaltaaNumeron(numero)== true){
                i--;
            } else {
                numerot.add(numero);
            }
        }
        // Kirjoita numeroiden arvonta tänne
        // kannattanee hyödyntää metodia sisaltaaNumeron
    }

    public boolean sisaltaaNumeron(int numero) {
        // Testaa tässä onko numero jo arvottujen numeroiden joukossa
    if (numerot.contains(numero)) {
            return true;
        } else {
        return false;
        }
    }
    
}
