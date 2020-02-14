package com.capg.lab3;
import java.util.Arrays;
import java.util.Scanner;
public class Exercise2 {

	public String[] SortAlphabetical(String a[]) {
		Arrays.sort(a);
		System.out.println("After sorting ");
		for(String k:a) {
			System.out.println(k);
		}
		int n=(int)Math.ceil((a.length)/2.0);
		for(int i=0;i<n;i++) {
			a[i]=a[i].toUpperCase();
		}
		
		for(int i=n;i<a.length-1;i++) {
			a[i]=a[i].toLowerCase();
		}
		
		
			
			return a;
				
				
	}
	public static void main(String[] args) {
		Exercise2 obj=new Exercise2();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of Strings");
		int n=in.nextInt();
		String s[]=new String[n];
		System.out.println("Enter the strings");
		for(int i=0;i<n;i++) {
			s[i]=in.next();
		}
		String ar[]=obj.SortAlphabetical(s);
		
		for(String K:ar) {
			System.out.println(K);
	}
	}
}
