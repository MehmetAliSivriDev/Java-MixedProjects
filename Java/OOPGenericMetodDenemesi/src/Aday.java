
public abstract class Aday {
    
    private String isim;
    private int mat;
    private int trk;
    private int sos;
    private int fen;

    public Aday(String isim, int mat, int trk, int sos, int fen) {
        this.isim = isim;
        this.mat = mat;
        this.trk = trk;
        this.sos = sos;
        this.fen = fen;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTrk() {
        return trk;
    }

    public void setTrk(int trk) {
        this.trk = trk;
    }

    public int getSos() {
        return sos;
    }

    public void setSos(int sos) {
        this.sos = sos;
    }

    public int getFen() {
        return fen;
    }

    public void setFen(int fen) {
        this.fen = fen;
    }
    
    abstract int puanHesapla();
    
}
