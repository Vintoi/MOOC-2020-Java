
import java.util.HashMap;


public class Lyhenteet {
    private HashMap<String,String> lyh;
    
    public Lyhenteet(){
        this.lyh = new HashMap<>();
    }
    public void lisaaLyhenne(String lyhenne, String selite){
        this.lyh.put(lyhenne, selite);
    }
    
    public boolean onkoLyhennetta(String lyhenne){
        if (this.lyh.containsKey(lyhenne)){
            return true;
        } else {
            return false;
        }
    }
    public String haeLyhenne(String lyhenne){
        return this.lyh.get(lyhenne);
    }
}
