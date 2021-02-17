
public class EnsimmainenTilisiirtosi {

    public static void main(String[] args) {
        // Tili.Java:ssa olevaan koodiin ei tule koskea
        // tee ohjelmasi tänne
        Tili MatinTili = new Tili ("Matin tili", 1000);
        Tili OmaTili = new Tili ("Oma tili", 0 );
        
        MatinTili.otto(100);
        OmaTili.pano(100);
        
        System.out.println(MatinTili);
        System.out.println(OmaTili);
        MatinTili.toString();
        OmaTili.toString();
    }
}
