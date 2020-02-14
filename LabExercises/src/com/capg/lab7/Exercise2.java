package com.capg.lab7;
import java.util.*;

public class Exercise2 {
	public Map countCharacter(char[] a) {
		Map<Character,Integer> map=new HashMap();
		//int count[]=new int[256];
		int n=a.length;
		
		for(int i=0;i<n;i++) {
			char c=a[i];
			if(map.containsKey(c)) {
				int x=map.get(c)+1;
			    map.put(c,x);
				        }
			else {
				map.put(c, 1);
			  }
			}
			
		return map;	
	}

	public static void main(String[] args) {
		char []a=new char[20];
		Exercise2 obj=new Exercise2();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of characters");
        int n=in.nextInt();
        System.out.println("Enter the characters");
        for(int i=0;i<n;i++) {
        	a[i]=in.next().charAt(0);
        }
        System.out.println("Characters are...");
        for(char x:a) {
        	System.out.print(x+" ");
        }
        Map arr=obj.countCharacter(a);
        
        for(Object k:arr.keySet()) {
        	System.out.println(k+"->"+arr.get(k));
        }
        
        
        
	}

}
