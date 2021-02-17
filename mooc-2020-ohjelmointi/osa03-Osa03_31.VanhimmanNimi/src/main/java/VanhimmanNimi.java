
import java.util.Scanner;

public class VanhimmanNimi {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int max =0;
        String vanhin = " ";
        while (true) {
            String luettu = lukija.nextLine();
            if (luettu.equals("")) {
                break;
            }
            String[] palat = luettu.split(",");
            
            if (max < Integer.valueOf(palat[1])) {
                max = Integer.valueOf(palat[1]);
                vanhin = palat[0];
            }
            
        }
        System.out.println("Vanhimman nimi: " + vanhin);
    }
}

