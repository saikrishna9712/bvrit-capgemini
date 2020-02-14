package com.capg.lab3;
import java.util.*;
public class Exercise3 {

public int[] getSorted(int n[]) {
	for(int i=0;i<n.length;i++) {
		int x=n[i];
	int r,rev=0;
       	while(x>0) {
			 r=x%10;
			 rev=rev*10+r;
			x=x/10;
		}
       	n[i]=rev;
	}
	System.out.println("After Reversing...");
	for(int k:n) {
		System.out.println(k);
	}
       	Arrays.sort(n);
       	return n;
	}

	
	public static void main(String[] args) {
		Exercise3 obj= new Exercise3();
		Scanner in=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter the List");
	    for(int i=0;i<5;i++) {
	    	 a[i]=in.nextInt();
	    	
	    }
	    
	int arr[]=obj.getSorted(a);
	System.out.println("After sorting");
	for(int k:arr) {
	   System.out.println(k);
	}
	
	}

}
