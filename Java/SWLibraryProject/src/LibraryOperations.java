
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;


public class LibraryOperations {
    
    private Connection con = null;
    private java.sql.Statement statement = null;
    private PreparedStatement preparedStatement = null;
    
    public LibraryOperations ()
    {
        
        String url = "jdbc:mysql://"+DatabaseInfo.host+":"+DatabaseInfo.port+"/"+DatabaseInfo.dbName+"?useUnicode=true&characterEncoding=utf8";
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");   
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver is not found!");
        }
        
        try {
            con=(Connection) DriverManager.getConnection(url,DatabaseInfo.username,DatabaseInfo.password);
            
            System.out.println("Connection is successful!");
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }

    }
    
    public boolean loginControl (String username, String password)
    {
        
        String query = "Select * From administors where Username = ? and Password = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            return rs.next();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LibraryOperations.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public void register(String username, String password)
    {
        String query = "Insert into administors (username,password) VALUES (?,?)";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LibraryOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public ArrayList<BooksInfo> showBooks()
    {
        ArrayList<BooksInfo> output = new ArrayList<BooksInfo>();
        
        String query = "Select * From info_library";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next())
            {
                int id = rs.getInt("id");
                String bookName = rs.getString("name");
                String authorName = rs.getString("author");
                String publisherName = rs.getString("publisher");
                String numberPage = rs.getString("numberofpage");
                
                output.add(new BooksInfo(id, bookName, authorName, publisherName, numberPage));
            }
            return output;
            
        } catch (SQLException ex) {
            Logger.getLogger(LibraryOperations.class.getName()).log(Level.SEVERE, null, ex);
            return null;
                    
        }
      
    }

    public void addBook(String bName, String aName, String pName, String nPage)
    {
        String query = "Insert into info_library (name,author,publisher,numberofpage) VALUES (?,?,?,?)";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, bName);
            preparedStatement.setString(2, aName);
            preparedStatement.setString(3, pName);
            preparedStatement.setString(4, nPage);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(LibraryOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
    
    public void deleteBook (int id)
    {
        String query = "Delete From info_library where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(LibraryOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
       
    public void updateBook (int id, String bName, String aName, String pName, String nPage)
    {
        String query = "Update info_library set name = ?, author = ?, publisher = ?, numberofpage = ? where id = ?";
        
        try {
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setString(1, bName);
            preparedStatement.setString(2, aName);
            preparedStatement.setString(3, pName);
            preparedStatement.setString(4, nPage);
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();
                 
        } catch (SQLException ex) {
            Logger.getLogger(LibraryOperations.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}
