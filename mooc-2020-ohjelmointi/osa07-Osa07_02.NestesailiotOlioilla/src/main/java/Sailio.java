
public class Sailio {
    int tilavuus;
    
    public Sailio(){
        this.tilavuus = 0;
    }
    
    public int sisalto(){
        return this.tilavuus;
    }
    public void lisaa(int maara){
        if (maara < 0) {
        } else if(tilavuus + maara > 100){
            this.tilavuus = 100;
        } else {
            this.tilavuus = this.tilavuus + maara;
        }
    }
    public void poista(int maara){
        if (maara < 0) {
        } else if(tilavuus - maara < 0) {
            this.tilavuus = 0;
        } else {
            this.tilavuus = this.tilavuus -maara;
        }
    }
    @Override
    public String toString() {
        return tilavuus + "/100";
    }
}
