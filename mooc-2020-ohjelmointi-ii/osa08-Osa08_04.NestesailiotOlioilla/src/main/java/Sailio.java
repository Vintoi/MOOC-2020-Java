
public class Sailio {
    private int tilavuus;
    private int max;
    
    public Sailio(){
        this.max = 100;
        this.tilavuus = 0;
    }
    public int sisalto(){
        return this.tilavuus;
    }
    public void lisaa(int maara){
        if (maara < 0) {
            
        } else if (this.tilavuus + maara > max){
            this.tilavuus = 100;
        } else if (this.tilavuus + maara < 0) {
            this.tilavuus = 0;
        } else {
            this.tilavuus = this.tilavuus + maara;
        }
    }
    public void poista(int maara) {
        if (maara < 0) {
            
        } else if (this.tilavuus - maara < 0) {
            this.tilavuus = 0;
        } else {
            this.tilavuus = this.tilavuus - maara;
        }
        
    }
    public String toString() {
        return this.tilavuus + "/100";
    }
}
