
public class Elio implements Siirrettava {
    private int x;
    private int y;
    
    public Elio (int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "x: " + this.x + "; y: " + this.y;
    }
    
    public void siirra(int dx, int dy) {
        this.x = x + dx;
        this.y = y + dy;
        }
    }

