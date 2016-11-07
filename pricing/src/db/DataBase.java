package db;
import java.sql.*;

public class DataBase {
	
	//Java doesnt have destructor? not sure how or when to close this connection.
	private Connection connection = null; 
	
	public DataBase(){
		try {
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:test:db");
		} catch (Exception e){
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");
	}
	
	public void createTables(){
		Statement statement = null;
		try{
			//Create the first table
			statement = connection.createStatement();
			String sql = "CREATE TABLE IF NOT EXISTS SUPPLIERS " +
			             "BLA BLA BLA rest of sql statement";
			statement.executeUpdate(sql);
			statement.close();
			
			          
			//create the second table
			
		} catch (Exception e){
			
		}
		
	}

}
