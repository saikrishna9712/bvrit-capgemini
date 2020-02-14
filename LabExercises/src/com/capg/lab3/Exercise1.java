package com.capg.lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n;
    Exercise1 obj=new Exercise1();
    System.out.println("Enter number of elements");
    Scanner in=new Scanner(System.in);
    n=in.nextInt();
    int []a=new int[n];
System.out.println("Enter the numbers ");
    for(int i=0;i<n;i++) {
    	a[i]=in.nextInt();
    }
    int arr=obj.getSecondSmallest(a);
System.out.println(arr);
	}
public int getSecondSmallest(int a[]) {
	int i,j,temp=0;
	for(i=0;i<a.length;i++) {
		for(j=i+1;j<=a.length-1;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	//for(int k:a) {
		//System.out.print(k);
//	}
	return a[1];
}
}
