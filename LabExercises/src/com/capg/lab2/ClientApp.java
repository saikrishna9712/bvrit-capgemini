package com.capg.lab2;

public class ClientApp{

	public static void main(String[] args) {
		// TODO Book b1=new-generated method stub
Book b1=new Book(121,25,"Jungle Book","sai");
JournalPaper b2=new JournalPaper(223,17,"Ramayana","Valmiki",1002);
b1.checkIn();
b1.checkOut();
b1.addItem();
b2.checkIn();
b2.checkOut();
b2.addItem();
System.out.println(b2.checkIn(232));
System.out.println(b1+"\n"+b2);
	}

}
