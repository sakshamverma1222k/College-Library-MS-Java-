package ProjAplnMain;

//import java.sql.Connection;
//import java.sql.*;
//import java.util.Scanner;

public class Apln {

	public static void main(String[] args) {
		int j=0;
	  while(j==0) {
		System.out.println("		Library Management System		\n\n\n");
		System.out.println("Choose 1 to Issue Book");
		System.out.println("Choose 2 to Add or Delete Book From the Library");
		System.out.println("Choose 3 to Add or Delete Student From the Library");
		System.out.println("Choose 4 to Create A Database for a new class students");
		System.out.println("Choose 5 to Return Book");
		System.out.println("Choose 6 to visit Student Database");
		System.out.println("Choose 7 to visit Trannsaction History");
		System.out.println("Choose 8 to update Student Database");
		System.out.println("Choose 9 to exit");
		System.out.println("Your Default Response will be accepted as Choice 7 i.e. 'Exit'");
		j=1;
		System.out.println("Enter Your Choice(any nuber between 1-6)");
		//String url = "jdbc:mysql://localhost:3306/Student";
		//Scanner obj1 = new Scanner(System.in);
		//int choice = obj1.nextInt();
		
		/**if(choice==2) {
			Library Lib = new Library();
			Lib.addBook();
		}
		
		else if(choice==3) {
			System.out.println("Choose 1 to add student & 2 for delete student, your default choice is '1'");
			int choice_3 = obj1.nextInt();
			if(choice_3==2) {
				try {
					Connection conn = DriverManager.getConnection(url, "root", "12feb2000V");
					int i=0;
					while(i==0) {
						System.out.println("please provide the stream name from where student record will be deleted");
						Scanner obj2 = new Scanner(System.in);
						String Classs = obj2.nextLine();
						System.out.println("please provide the Student Unique ID of the Student whose record will be deleted");
						String StudIDD = obj2.nextLine();
						Statement stmt = conn.createStatement();
						ResultSet resultset = stmt.executeQuery("select * from "+Classs+"_tbl where StudId= '"+StudIDD+"';");
						while (resultset.next()) {
							System.out.println("Are you sure you want to delete this Student record where");
							System.out.println(resultset.getString("name")+" is name of student");
							System.out.println(resultset.getString("cls")+" is class");
							System.out.println(resultset.getString("section")+" is section");
							System.out.println(resultset.getString("Roll")+" is roll");
						}
						System.out.println("Choose y to delete or n to choose again");
						char YN = obj2.next().charAt(0);
						if(YN=='y'||YN=='Y') {
							i=1;
							//PreparedStatement pstmt=null;
							stmt=conn.prepareStatement("delete from "+Classs+"_tbl where StudId= '"+StudIDD+"'");
							conn.close();
							obj2.close();
							System.out.println("Student record is deleted");
						}
						else {
							System.out.println("Choose Again or exit by pressing 't'");
							char CA = obj2.next().charAt(0);
							if(CA=='y'||CA=='Y') {
								i=1;
								}
							obj2.close();
							}
						}
					}	catch (SQLException e) {
						e.printStackTrace();
						}
			} else {
				Student stu1 = new Student();
				System.out.println("please provide the stream name to where student details will be added");
				Scanner obj2 = new Scanner(System.in);
				String Classs = obj2.nextLine();
				String[] v = null;
				v=stu1.addStudent(v);
				try {
					Connection conn = DriverManager.getConnection(url, "root", "12feb2000V");
					String q="insert into "+Classs+"_tbl(name,StudId,credits,cls,roll,age,section) values(?,?,?,?,?,?,?)";
					//("v[0]","v[1]","v[2]","v[3]","v[4]","v[5]","v[6]","v[7]")";
					PreparedStatement pstmt=conn.prepareStatement(q);
					pstmt.setString(1,v[0]);
					pstmt.setString(2,v[1]);
					pstmt.setString(3,v[2]);
					pstmt.setString(4,v[3]);
					pstmt.setString(5,v[4]);
					pstmt.setString(6,v[5]);
					pstmt.setString(7,v[6]);
					pstmt.executeUpdate();
					System.out.println("inserted...");
					ResultSet resultset = pstmt.executeQuery("select * from "+Classs+"_tbl");
					int i=1;
					while(resultset.next()) {
						System.out.println(resultset.getString("name")+" (Roll-"+i+")");
						System.out.println(resultset.getString("StudId"));
						i++;
					}
					conn.close();
				}	catch (SQLException e) {
						e.printStackTrace();
					}
				obj2.close();
			}
			
		}
		
		else if(choice==6) {
			try {
				Connection conn = DriverManager.getConnection(url, "root", "12feb2000V");
				Statement statement = conn.createStatement();
				System.out.println("please provide the stream name for which the database will be shown");
				Scanner obj2 = new Scanner(System.in);
				String Classs = obj2.nextLine();
				ResultSet resultset = statement.executeQuery("select * from "+Classs+"_tbl");
				int i=1;
				while(resultset.next()) {
					System.out.println(resultset.getString("name")+" (Roll-"+i+")");
					System.out.println(resultset.getString("StudId"));
					i++;
				}
				conn.close();
				obj2.close();
			} 	catch (SQLException e) {
					e.printStackTrace();
				}
		}
		
		else if(choice==4) {
			try {
				Connection conn = DriverManager.getConnection(url, "root", "12feb2000V");
				System.out.println("Provide The Stream Name For Creation Of Table:");
				Scanner obj2 = new Scanner(System.in);
				String Classs = obj2.nextLine();
				String q="create table "+Classs+"_tbl (name varchar(30),StudId varchar(30) PRIMARY KEY,credits int(10),cls varchar(10),roll int(10),age int(10),section char(1))";
				Statement stmt = conn.createStatement();
				stmt.executeUpdate(q);
				System.out.println("Table Created...");
				conn.close();
				obj2.close();
			}
			catch (SQLException e) {
					e.printStackTrace();
			}
		}
		
		else if(choice==8) {
			
		}
		
		else {
				obj1.close();
				System.out.println("You Choose To Exit. The Prgram Will Exit Now.");
				j=1;
		}*/
	  }
	}
	
}