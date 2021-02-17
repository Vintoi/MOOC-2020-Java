
public class Tuote {
    private String tunnus;
    private String nimi;
    
    public Tuote(String tunnus, String nimi){
        this.tunnus = tunnus;
        this.nimi = nimi;
    }
    public boolean equals(Object verrattava) {
        if (this == verrattava) {
            return true;
        }

        // jos verrattava olio ei ole Lintu-tyyppinen, oliot eivät ole samat
        if (!(verrattava instanceof Tuote)) {
            return false;
        }

        // muunnetaan olio Lintu-olioksi
        Tuote verrattavaKirja = (Tuote) verrattava;

       
        if (this.tunnus.equals(verrattavaKirja.tunnus)) {
            return true;
        }
        return false;
    }
        @Override
        public String toString() {
        return this.tunnus + ": " + this.nimi;
    }
}
