
import java.util.ArrayList;
import java.util.Collections;


public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testikoodia
ArrayList<Kortti> kortit = new ArrayList<>();

kortit.add(new Kortti(3, Maa.PATA));
kortit.add(new Kortti(2, Maa.RUUTU));
kortit.add(new Kortti(14, Maa.PATA));
kortit.add(new Kortti(12, Maa.HERTTA));
kortit.add(new Kortti(2, Maa.PATA));

SamatMaatVierekkain samatMaatVierekkainJarjestaja = new SamatMaatVierekkain();
Collections.sort(kortit, samatMaatVierekkainJarjestaja);

kortit.stream().forEach(k -> System.out.println(k));
    }
}
