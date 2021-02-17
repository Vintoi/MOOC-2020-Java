
public class Taikaneliotehdas {

    public Taikanelio luoTaikanelio(int koko) {

        Taikanelio nelio = new Taikanelio(koko);
        
        int x = koko/2;
        int y = 0;
        int arvo = 1;
        
        while (true) {
            
            if (arvo > koko*koko) {
                break;
            }
            
            if (nelio.onTaikanelio()) {
                break;
            }

            if (nelio.annaArvo(x, y) > 0) {
               x--;
               y += 2; 
                
            } else {
                
                nelio.asetaArvo(x, y, arvo);
                arvo++;
                x++;
                y--;
                
            }
            
            if (x > koko-1 && y < 0) {
                x = koko-1;
                y += 2;
            }
            
            if (y < 0) {
                y = koko-1;
            }
            
            if (x > koko-1) {
                x = 0;
            }
            
        }
            
        
        return nelio;
    }
}


