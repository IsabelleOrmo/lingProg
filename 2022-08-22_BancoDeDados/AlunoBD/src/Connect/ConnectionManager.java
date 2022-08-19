/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author aluno
 */
public class ConnectionManager {
    private Connection connection;
    private static ConnectionManager connectionManager;
    
    private ConnectionManager(String url, String user, String password) throws SQLException {
        this.connection = (Connection) DriverManager.getConnection(url, user, password);
    }
    
    private ConnectionManager() throws SQLException {
        this("jdbc:mysql://143.106.241.3:3306/cl201290", "cl201290", "cl*24032006");
    }
    
    public static Connection getConnection() throws SQLException {
        if (connectionManager == null)
            connectionManager = new ConnectionManager();

        return connectionManager.connection;
    }
}
