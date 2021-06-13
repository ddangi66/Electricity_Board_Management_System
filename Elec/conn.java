package Elec;
import java.sql.*;

public class conn
{
	public Connection c=null;
	public Statement s=null;
	public PreparedStatement ps1=null;
	public conn()
	{
		try
		{
			Class.forName("org.postgresql.Driver");
			c=DriverManager.getConnection("jdbc:postgresql://192.168.16.1/BG21","BG21","");
			if(c==null)
				System.out.println("Connection Failed");
			else
				System.out.println("Connection Successful..");
			s=c.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
