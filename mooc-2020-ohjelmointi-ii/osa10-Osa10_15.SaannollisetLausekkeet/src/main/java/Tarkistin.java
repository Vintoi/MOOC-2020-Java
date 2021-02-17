

public class Tarkistin {
    
    public Tarkistin(){
        
    }
    public boolean onViikonpaiva(String merkkijono) {
        if (merkkijono.matches("ma|ti|ke|to|pe|la|su")) {
            return true;
        } else {
            return false;
        }
    }
    public boolean kaikkiVokaaleja(String merkkijono) {
        if (merkkijono.matches("(a|e|o|u|i|ö|ä|y)+")) {
            return true;
           
        } else {
            return false;
        }
        
    }
    public boolean kellonaika(String merkkijono) {
         if (merkkijono.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]")){
        // if (merkkijono.matches("([01][0123456789]|2[0123]):[012345][0123456789]:[012345][0123456789]")) {
            return true;
            
        } else {
        return false;
    }
    }
}
