
public class LukujenKeskiarvo {

    // toteuta tähän uudelleen aiemmin tekemäsi summametodi
    public static int summa(int luku1, int luku2, int luku3, int luku4) {
        // kirjoita koodia tähän
        int summa = luku1 + luku2 + luku3 + luku4;
        return summa;
    }

    public static double keskiarvo(int luku1, int luku2, int luku3, int luku4) {
        int sum = summa(luku1, luku2, luku3, luku4);
        double ka = 1.0 * sum / 4;
        return ka;
    }

    public static void main(String[] args) {
        double vastaus = keskiarvo(4, 3, 6, 1);
        System.out.println("Keskiarvo: " + vastaus);
    }
}
