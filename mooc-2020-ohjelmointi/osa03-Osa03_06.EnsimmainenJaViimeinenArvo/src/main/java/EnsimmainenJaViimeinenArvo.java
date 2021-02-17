
import java.util.ArrayList;
import java.util.Scanner;

public class EnsimmainenJaViimeinenArvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<String> lista = new ArrayList<>();
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }

            lista.add(luettu);
        }
        int koko = lista.size();
        for (int i = 0; i < koko; i++) {
            if (i == 0) {
                System.out.println(lista.get(i));
            }
            if (i+1 == koko) {
                System.out.println(lista.get(i));
            
            } 
        }
    }
}
