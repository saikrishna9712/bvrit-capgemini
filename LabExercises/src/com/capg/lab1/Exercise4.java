package com.capg.lab1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
		Exercise4 obj=new Exercise4();
		Scanner in=new Scanner(System.in);
        n=in.nextInt();
        System.out.println(obj.checkNumber(n));
	}
public boolean checkNumber(int n) {
	while(n>1) {
		if(n%2==0) {
			n=n/2;
		}
		else {
			return false;
		}
	}
	return true;
}
}
