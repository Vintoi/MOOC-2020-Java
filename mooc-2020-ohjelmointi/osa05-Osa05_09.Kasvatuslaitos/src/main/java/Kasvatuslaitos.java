
public class Kasvatuslaitos {
    private int punnitus;

    public int punnitse(Henkilo henkilo) {
        // palautetaan parametrina annetun henkilön paino
        this.punnitus = this.punnitus + 1 ;
        return henkilo.getPaino();
    }
    public void syota(Henkilo henkilo){
        int paino = henkilo.getPaino() +1;
        henkilo.setPaino(paino);
    }
    public int punnitukset(){
        return this.punnitus;
    }

}
