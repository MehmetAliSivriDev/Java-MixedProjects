    //Normal Classlarda Sanal Fonksiyon Ornegi
    class Hayvan
    {
        public void yemek()
        {
            System.out.println("Hayvan, hayvan yemegi yiyor.");
        }
    }
    
    class Aslan extends Hayvan
    {
        //Sanal Fonksiyon Ornegi
        @Override
        public void yemek() {
            System.out.println("Aslan, et yemegi yiyor.");
        }
    }
    
    class AslanYavrusu extends Aslan
    {
        //Sanal Fonksiyon Ornegi
        @Override
        public void yemek() {
            System.out.println("Aslan Yavrusu, Anne Aslan'in verdigi yemegi yiyor.");
        } 
    }
    //*********************************************************************************
    
    //Interfacede Sanal Fonksiyon Ornegi
    interface araba
    {
        void motorCalitir();
    }
    
    class Mercedes implements araba
    {
        //Sanal Fonksiyon Ornegi
        @Override
        public void motorCalitir() {
            System.out.println("Araba motoru calistirildi.");
        }
        
    }
    //*********************************************************************************
    
    abstract class dukkan
    {
        public void camlariAc()
        {
            System.out.println("Dukkanin Camlari Aciliyor...");
        }
        
        abstract void dukkaniAc();
    }
    
    class Bakkal extends dukkan
    {
        //Sanal Fonksiyon Ornegi
        @Override
        void dukkaniAc() {
            System.out.println("Bakkal Aciliyor...");
        }
        
    }
    //*********************************************************************************


public class VirtualFunctionOrnegi {
    
    
    
    public static void main(String[] args) {
        
        //Normal Siniflar Arasi Gerceklestirilen Sanal Fonksiyon Cagirma Islemi 
        Hayvan hayvan1 = new Hayvan();
        Hayvan Aslan = new Aslan();
        Hayvan AslanYavrusu = new AslanYavrusu();
        
        hayvan1.yemek();
        Aslan.yemek();
        AslanYavrusu.yemek();
        //*********************************************************************
        
        //Interface Implement Eden Sinifta Sanal Fonksyion Cagirma Islemi
        Mercedes mercedes = new Mercedes();
        
        mercedes.motorCalitir();
        //*********************************************************************
        
        //Abstract Sinifi Extends Eden Sinifta Sanal Fonksiyon Cagirma Islemi
        Bakkal bakkalDukkani = new Bakkal();
        
        bakkalDukkani.dukkaniAc();
        bakkalDukkani.camlariAc();
        //*********************************************************************
        
    }
}
