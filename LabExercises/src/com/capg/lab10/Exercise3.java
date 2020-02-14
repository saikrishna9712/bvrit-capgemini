package com.capg.lab10;
import java.util.*;

interface Abc{
	boolean method(String x,String y);
}



public class Exercise3 {

	public static void main(String[] args) {
		System.out.println("Enter user name");
		String name=new Scanner(System.in).nextLine();
        System.out.println("Enter password");
        String pass=new Scanner(System.in).nextLine();
        Abc obj=(x,y)-> {
        	String a="saikrishna";
        	String b="123456789";
        	if(name.equalsIgnoreCase(a) && pass.equalsIgnoreCase(b)) {
        		return true;
        	}
        	else {
        		return false;
        	}
        	
        };
        System.out.println(obj.method(name, pass));
	}

}
