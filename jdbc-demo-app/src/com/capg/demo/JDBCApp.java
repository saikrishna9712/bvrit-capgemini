package com.capg.demo;
import java.sql.*;
import java.util.*;
public class JDBCApp {

	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String user="scott";
		String password="tiger";
		try {
			//1. Create connection
			Connection con=DriverManager.getConnection(url,user,password);
		    System.out.println("Connection successful ");
		    
		    
		    //2. Create statement
		    Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		                 
		    System.out.println("Enter name:");
		    String sname=new Scanner(System.in).nextLine();
		    System.out.println("Enter age:");
		    int age=new Scanner(System.in).nextInt();
		    
		    
		    //3. Execute query
		    ResultSet rs=smt.executeQuery("select * from bvrit_student where sname='" +sname+"'and age="+age);
		                
		   
		    //4. Processing ResultSet
		    if(!rs.next()) {
		    	System.out.println("No Data Found");
		    }
		    else {
		    	rs.previous();
			    System.out.printf("%-10s%-30s%-10s\n","Roll", "Name", "Age");

		    while(rs.next()) {
		    	System.out.printf("%-10d",rs.getInt("roll"));
		    	System.out.printf("%-30s",rs.getString(2));
		    	System.out.printf("%-10d",rs.getInt(3));
		    	System.out.println();
		    }
		    }
		}
		catch (SQLException e) {
			e.printStackTrace();
    	}

	}

}
