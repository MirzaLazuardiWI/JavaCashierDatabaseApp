
package icecream;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class IceCream {

    CustomerForm cf = new CustomerForm();
    LoginFrame lf = new LoginFrame();
    RegisterFrame rf = new RegisterFrame();
    DatabaseCon dbcon;
    
    private String query;
    private Statement stmt;
    private ResultSet rs;
    String id;
    
    public IceCream(){
       lf.setVisible(true);
       dbcon = new DatabaseCon();
    }
    
    public void getId(){
        this.id = lf.id;
    }
    
    public static void main(String[] args){
        IceCream ic = new IceCream();
    }
}
