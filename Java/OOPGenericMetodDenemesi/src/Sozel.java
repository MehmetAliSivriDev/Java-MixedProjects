
public class Sozel extends Aday {

    public Sozel(String isim, int mat, int trk, int sos, int fen) {
        super(isim, mat, trk, sos, fen);
    }
    
    @Override
    public int puanHesapla() {
        
        return getMat() * 2 + getTrk() * 5 + getSos() * 4 + getFen() * 2;

    }
    
    
    
}
