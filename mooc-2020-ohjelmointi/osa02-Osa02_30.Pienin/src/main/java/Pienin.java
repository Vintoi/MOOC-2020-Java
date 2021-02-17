
public class Pienin {

    public static int pienin(int luku1, int luku2) {
        // kirjoita koodia tähän
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return
        int min = 0;
        if (luku1 > luku2) {
            min = luku2;  
        } else if (luku1 < luku2 ){
            min = luku1;
        }
        return min;
    }
    
    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
