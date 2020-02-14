package com.capg.lab7;
import java.util.*;
import java.util.List;

public class Exercise1 {
	
	public List<Integer> getvalues(HashMap<Integer,Integer> a) {
		
		List<Integer> list=new ArrayList<Integer>();
		for(int i=1;i<=a.size();i++) {
			int b=a.get(i);
			list.add(b);
		}
		Collections.sort(list);
		return list;
	}
	
	

	public static void main(String[] args) {
	Exercise1 obj=new Exercise1();
	Scanner in=new Scanner(System.in);	
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    System.out.println("Enter the number of values");
    int n=in.nextInt();
    System.out.println("Enter the values");
    for(int i=1;i<=n;i++){
       int a=in.nextInt();
       hm.put(i,a);
          }
    System.out.println("Entered values are...");
     for(int k:hm.keySet()) {
      	System.out.println(hm.get(k));
                  }
     List<Integer> ar=obj.getvalues(hm);
     System.out.println("Sorted values in list are..");
    		for(int j:ar) {
    			System.out.println(j);
    		}

	}
}