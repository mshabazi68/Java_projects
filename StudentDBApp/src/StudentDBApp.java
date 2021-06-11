import java.sql.*;
public class StudentDBApp {
/*
 * asking user how many student will be added to the database 
 * the user should promoted to enter the name and year for each student 
 * student should have 5 digit unique ID with first number being their grade level 
 * student can enroll in the following 
 */
	

	public void connectSQL() {
		try { 
			Class.forName ("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select*from emp");
			while (rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+ rs.getString(3));
			con.close();
		}catch (Exception e){System.out.println(e);}
		
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDBApp myob = new StudentDBApp ();
		Student mystudent = new Student();
	
		mystudent.enroll();
		mystudent.payTuition();
		System.out.println(mystudent.statusPayment());
		
		//myob.connectSQL();
	}
}
