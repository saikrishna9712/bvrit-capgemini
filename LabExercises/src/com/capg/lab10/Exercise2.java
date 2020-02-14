package com.capg.lab10;
import java.util.*;
interface StringLambda{
	String formatString(String s);
}

public class Exercise2 {

	public static void main(String[] args) {
	     System.out.println("Enter a string");
		String str=new Scanner(System.in).nextLine();
		StringLambda obj=(s)-> {
			String x="";
			for(char c:s.toCharArray()) {
				x=x+c+" ";
			}
           return x;			
		};
		String a=obj.formatString(str);
		System.out.println(a);
	}

}
