
public class Lukutaito implements Comparable<Lukutaito> {
    private String teema;
    private String ikaryhma;
    private String sukupuoli;
    private String maa;
    private int vuosi;
    private double prosentti;
    
    public Lukutaito(String te, String ik, String suk, String maa, int vu, Double pro){
        this.teema = te;
        this.ikaryhma = ik;
        this.sukupuoli = suk;
        this.maa = maa;
        this.vuosi = vu;
        this.prosentti = pro;
    }

    public String getTeema() {
        return teema;
    }

    public String getIkaryhma() {
        return ikaryhma;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public String getMaa() {
        return maa;
    }

    public double getProsentti() {
        return prosentti;
    }

    @Override
    public String toString() {
        
        return this.maa + " (" + this.vuosi + ")," + this.sukupuoli + ", " + this.prosentti;
    }

    @Override
    public int compareTo(Lukutaito o) {
        
        if (this.prosentti == o.getProsentti()) {
            return 0;
        } else if (this.prosentti > o.getProsentti()) {
            return 1;
        } else {
            return -1;
        }
        
    }
    
    
}
