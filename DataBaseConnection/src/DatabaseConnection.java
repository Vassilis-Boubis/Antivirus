
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	public class DatabaseConnection {
	    // Connect to your database.
	    // Replace server name, username, and password with your credentials
	    public static void main(String args[]) {
	        String connectionUrl =
	                "jdbc:sqlserver://sqlserver.dmst.aueb.gr;"
	                        + "database=DB69;"
	                        + "user=G569@sqlserver.dmst.aueb.gr;"
	                        + "password=98vf34gv949;"
	                        + "encrypt=true;"
	                        + "trustServerCertificate=false;"
	                        + "loginTimeout=30;";

	        try (Connection connection = DriverManager.getConnection(connectionUrl);) {
	            // Code here.
	        }
	        // Handle any errors that may have occurred.
	        catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}
