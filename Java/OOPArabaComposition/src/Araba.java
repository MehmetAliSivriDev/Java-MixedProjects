
public class Araba {
    
    
    private String arabaMarkasi;
    private String arabaRengi;
    private int arabaYasi;
    private motor motor;
    private Kapılar kapilar;
    private Farlar farlar;

    public Araba(String arabaMarkasi, String arabaRengi, int arabaYasi, motor motor, Kapılar kapilar, Farlar farlar) {
        this.arabaMarkasi = arabaMarkasi;
        this.arabaRengi = arabaRengi;
        this.arabaYasi = arabaYasi;
        this.motor = motor;
        this.kapilar = kapilar;
        this.farlar = farlar;
    }

    public String getArabaMarkasi() {
        return arabaMarkasi;
    }

    public void setArabaMarkasi(String arabaMarkasi) {
        this.arabaMarkasi = arabaMarkasi;
    }

    public String getArabaRengi() {
        return arabaRengi;
    }

    public void setArabaRengi(String arabaRengi) {
        this.arabaRengi = arabaRengi;
    }

    public int getArabaYasi() {
        return arabaYasi;
    }

    public void setArabaYasi(int arabaYasi) {
        this.arabaYasi = arabaYasi;
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public Kapılar getKapilar() {
        return kapilar;
    }

    public void setKapilar(Kapılar kapilar) {
        this.kapilar = kapilar;
    }

    public Farlar getFarlar() {
        return farlar;
    }

    public void setFarlar(Farlar farlar) {
        this.farlar = farlar;
    }
    
    
    
    
}
