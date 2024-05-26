import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Databaseconnection {

	public static Databaseconnection instance = null;
	Connection conn=null;
	
	private Databaseconnection()
	{
		try 
		{ 
			final String DB_URL = "jdbc:mysql://127.0.0.1:3306/";
			final String USER = "root", PASS = "Akash3011@";
			conn =DriverManager.getConnection(DB_URL,USER,PASS);
			
		}
		
		catch (Exception e)
		{
			System.out.println("connection failed");
			e.printStackTrace();
		}
	}
	
	public static Databaseconnection getInstance()
	{
		if(instance == null)
		{
			synchronized(Databaseconnection.class)
			{
				if(instance == null)
				{
					instance=new Databaseconnection();
					System.out.println("Hiiiiiii");
				}
			}
		}
		return instance;
	}
	
	public static Databaseconnection closeInstance() throws SQLException
	{
		instance.getInstance().conn.close();
		return instance;
	}
}
