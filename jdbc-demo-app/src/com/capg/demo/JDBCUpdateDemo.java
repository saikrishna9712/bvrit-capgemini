package com.capg.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;
public class JDBCUpdateDemo {

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
					 ("update bvrit_student set age=? where roll=?");
			
			int roll;
			System.out.println("Enter roll you want to update");
			roll=in.nextInt();
			System.out.println("Enter new age : ");
			int age=in.nextInt();
			
			//Set the parameters
			psmt.setInt(1,age);
			psmt.setInt(2, roll);
			
			
			//3. Execute update
			int r=psmt.executeUpdate();
			if(r>0) {
				System.out.println("Updated Successfully");
			}
			else {
				System.out.println("Updation failed");
			}
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
