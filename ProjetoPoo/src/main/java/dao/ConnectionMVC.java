
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author debor
 */
public class ConnectionMVC {
    
    public Connection getConnection(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        }catch(ClassNotFoundException e){
        e.printStackTrace();
    }
        return conn;
    }
}
