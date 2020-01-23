
package sp10;
import java.sql.*;
import java.util.*;
public class Jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
try
{
	Scanner s=new Scanner(System.in);
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "System", "ORACLE");
	//Statement s=c.createStatement();
	PreparedStatement ps=s.PrepareStatement("INSERT INTO ASHRITHA.DEPT VALUES(?,?,?)");
	ps.setInt(1,s.nextInt());
	ps.setString(2,s.next());
	int count=ps.executeUpdate();
	System.out.println(count+"rows inserted");
	/*ResultSet rs=s.executeQuery("select * from ashritha.dept");
	while(rs.next())
	{
		System.out.println("deptno"+rs.getInt(1)+"\t"+"Dname"+rs.getString(2)+"\t"+"loc"+rs.getString(3));
		
	}*/
System.out.println(count+"rows inserted");
}
catch(SQLException e)
{
	System.out.println(e);
}
	}

}
