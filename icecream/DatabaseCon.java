
package icecream;

import java.sql.*;
import java.sql.DriverManager;

public class DatabaseCon {
    
    public Connection con;
    private ResultSet rs;
    private Statement stmt;
    
    public DatabaseCon(){
        try{
            String driver =  "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/IceCreamStore";
            String username = "root";
            String password = "";
          
            Class.forName(driver);
            
            Connection conn = DriverManager.getConnection(url,username,password);
            
            System.out.println("Connect!");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public ResultSet executeQuery(String query)throws SQLException{
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        }catch(SQLException e){
            System.out.println(e);
        }
        
        return rs;
    }
     
}
