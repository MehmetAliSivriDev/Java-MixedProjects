
public class Sayisal extends Aday {

    public Sayisal(String isim, int mat, int trk, int sos, int fen) {
        super(isim, mat, trk, sos, fen);
    }         
    
    @Override
    public int puanHesapla() {
        
        return getMat() * 5 + getTrk() * 2 + getSos() * 2 + getFen() * 4;
    }
    
    
    
}
