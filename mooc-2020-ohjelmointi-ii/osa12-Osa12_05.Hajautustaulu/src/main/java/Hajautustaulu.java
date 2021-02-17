
import java.util.ArrayList;

public class Hajautustaulu<K, V> {

    private ArrayList<Pari<K, V>> arvot;
    private int arvoja;

    public Hajautustaulu() {
        this.arvot = new ArrayList<>();
        this.arvoja = 0;
    }
    public V hae(K avain) {
    int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.size());
    if (this.arvot.get(hajautusArvo) == null) {
        return null;
    }
    ArrayList<Pari<K, V>> arvotIndeksissa = new ArrayList<>();
    arvotIndeksissa = this.arvot;

    for (int i = 0; i < arvotIndeksissa.size(); i++) {
        if (arvotIndeksissa.get(i).getAvain().equals(avain)) {
            return arvotIndeksissa.get(i).getArvo();
        }
    }

    return null;
}
    private ArrayList <Pari<K, V>> haeAvaimeenLittyvaLista(K avain) {
        int hajautusArvo = Math.abs(avain.hashCode() % this.arvot.size());
        if (this.arvot.get(hajautusArvo) == null) {
            this.arvot= new ArrayList<>();
        }
 
        return this.arvot;
    }
 
    private int haeAvaimenIndeksi(ArrayList <Pari<K, V>> lista, K avain) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getAvain().equals(avain)) {
                return i;
            }
        }
    return -1;
    }
        public void lisaa(K avain, V arvo) {
        ArrayList <Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
 
        if (indeksi < 0) {
            arvotIndeksissa.add(new Pari<>(avain, arvo));
            this.arvoja++;
        } else {
            arvotIndeksissa.get(indeksi).setArvo(arvo);
        }
 
        if (1.0 * this.arvoja / this.arvot.size() > 0.75) {
            kasvata();
        }

    }
        private void kasvata() {
    
        ArrayList <Pari<K, V>> uusi = new ArrayList(this.arvot.size() * 2);
 
        for (int i = 0; i < this.arvot.size(); i++) {
                kopioi(uusi, i);
                }

    // korvataan vanha taulukko uudella
    this.arvot = uusi;
    } 
    private void kopioi(ArrayList <Pari<K, V>> uusi, int indeksista) {
        
        for (int i = 0; i < this.arvot.size(); i++) {
        Pari<K, V> arvo = this.arvot.get(i);
 
        int hajautusarvo = Math.abs(arvo.getAvain().hashCode() % uusi.size());
        if(uusi.get(hajautusarvo) == null) {
            uusi = new ArrayList<>();
        }
 
        uusi.add(arvo);
    }
    
}    
    public V poista(K avain) {
        ArrayList <Pari<K, V>> arvotIndeksissa = haeAvaimeenLittyvaLista(avain);
        if (arvotIndeksissa.size() == 0) {
            return null;
        }
 
        int indeksi = haeAvaimenIndeksi(arvotIndeksissa, avain);
        if (indeksi < 0) {
            return null;
        }
 
        Pari<K, V> pari = arvotIndeksissa.get(indeksi);
        arvotIndeksissa.remove(pari);
        return pari.getArvo();
    }
}


