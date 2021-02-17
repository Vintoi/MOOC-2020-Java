
public class Suurin {

    public static int suurin(int luku1, int luku2, int luku3) {
        int max = luku1;
        int min =luku1;
        
        if (luku1 < luku2){
            min = luku1;
            max = luku2;
        } 
        if (luku2 < luku3 ) {
            min = luku2;
            max = luku3;
        } 
        if (luku1 > luku3) {
            min = luku3;
            max = luku1;
        }
        return max;
    }

    public static void main(String[] args) {
        int vastaus = suurin(2, 7, 3);
        System.out.println("Suurin: " + vastaus);
    }
}
