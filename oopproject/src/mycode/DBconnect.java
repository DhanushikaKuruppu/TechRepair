
package mycode;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;

public class DBconnect {
    
    public static Connection connect (){
    
    Connection conn = null;
    
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/oopproject","root","");
        
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    
    return conn;
}
    
}
