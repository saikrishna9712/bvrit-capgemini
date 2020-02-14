package com.capg.lab3;
import java.util.*;
public class Exercise4 {
	public void CharacterCount(char a[]) {
		
		for(int i=0;i<a.length;i++) {
			int count=1; 
			for(int j=0;j<a.length;j++) {
				if(i!=j) {
				if(a[i]==a[j]) {
					count++;
					  }
				
			}
			if(count>1) {
			System.out.println(a[i]+"-->"+count);
			}
			}
		 }
		
	}

	public static void main(String[] args) {
		
		Exercise4 obj=new Exercise4();
	    Scanner in=new Scanner(System.in);
	    char [] a=new char[10]; 
	    System.out.println("Enter the characters ");
	    for(int i=0;i<10;i++) {
	    a[i]=in.next().charAt(0);
	    }
	    
	    obj.CharacterCount(a);
		}

}
