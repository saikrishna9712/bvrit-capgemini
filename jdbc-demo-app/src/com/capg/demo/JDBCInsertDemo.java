package com.capg.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class JDBCInsertDemo {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		try {
			//1. Create conncetion
			
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user="scott";
			String password="tiger";
			Connection con=DriverManager.getConnection(url, user, password);
			
			
			
			//2. Create Statement
			PreparedStatement psmt=con.prepareStatement
					 ("insert into bvrit_student values(?,?,?)");
			
			int roll,age;
			String sName;
			System.out.println("Enter roll,name,age");
			roll=in.nextInt();
			sName=in.next()+in.nextLine();
			age=in.nextInt();
			
			//Set the parameters
			psmt.setInt(1, roll);
			psmt.setString(2, sName);
			psmt.setInt(3,age);
			
			//3. Excute update
				int r=psmt.executeUpdate();
			if(r>0) {
				System.out.println("Inserted Successfully");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
