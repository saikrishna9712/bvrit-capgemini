package com.capg.lab1;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
		Scanner in=new Scanner(System.in);
        n=in.nextInt();
        Exercise3 obj=new Exercise3();
        System.out.println(obj.checkNumber(n));
	}
public boolean checkNumber(int n) {
	int s=9;
	while(n>0) {
		if(n%10<=s) {
			s=n%10;
			n=n/10;
		}
		else {
			return false;
		 }
	}
	return true;
}
}
