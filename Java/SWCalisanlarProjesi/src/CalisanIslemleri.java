
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;


public class CalisanIslemleri {
    
    private Connection con = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public boolean girisKontrol(String kullaniciAdi, String parola)
    {
        
        String sorgu = "Select *From adminler where username = ? and password = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            preparedStatement.setString(1, kullaniciAdi);
            preparedStatement.setString(2,parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    public ArrayList<Calisan> calisanlariGetir()
    {
        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        
        try {
            statement = con.createStatement();
            String sorgu = "Select *From calisanlar";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String departman = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, departman, maas));          
            }
            return cikti;
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   
    }
    
    public void calisanEkle(String ad, String soyad, String departman, String maas)
    {
        String sorgu = "Insert into calisanlar (ad,soyad,departman,maas) VALUES(?,?,?,?)";
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, ad);
            preparedStatement.setString(2, soyad);
            preparedStatement.setString(3, departman);
            preparedStatement.setString(4, maas);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void calisanGuncelle (int id, String yeniAd, String yeniSoyad, String yeniDepartman, String yeniMaas)          
    {
        String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeniAd);
            preparedStatement.setString(2,yeniSoyad);
            preparedStatement.setString(3, yeniDepartman);
            preparedStatement.setString(4,yeniMaas);
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
                    
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void calisanSil (int id)
    {
        String sorgu = "Delete From calisanlar where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public CalisanIslemleri()
    {
        
        String url ="jdbc:mysql://"+Database.host+":"+Database.port+"/"+Database.dbIsmi+"?useUnicode=true&characterEncoding=utf8";
        
         try
        {
            
             Class.forName("com.mysql.cj.jdbc.Driver");

        }
        catch (ClassNotFoundException ex) {

            System.out.println("Driver Bulunamadı.");

        }
         
         try
         {
            con=(Connection) DriverManager.getConnection(url,Database.kullaniciAdi,Database.parola);

            System.out.println("Baglanti Basarili!");
         } catch (SQLException ex) {
            ex.printStackTrace();
        }
         
    }

}
