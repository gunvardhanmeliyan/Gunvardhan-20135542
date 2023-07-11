import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igtexamq1","root","groot");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from employee");
while(rs.next()) {
	System.out.println("Employee Id: "+rs.getInt(1));
	System.out.println("Employee Name: "+rs.getString(2));
	System.out.println("Employee Age: "+rs.getInt(3));
	System.out.println("Employee Salary: "+rs.getInt(4));
	System.out.println("Employee Designation: "+rs.getString(5));
	System.out.println("===============================================");

	
}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
