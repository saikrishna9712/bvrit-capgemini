package com.capg.lab2;

public class Book extends WrittenItem {
	
	public void checkIn() {
	System.out.println("check-in");
}
public void checkOut() {
	System.out.println("check out");
}

public void addItem() {
	System.out.println("Item Added");
}
public Book() {}
public Book(int id,int copies,String title,String author) {
	super(id,copies,title,author);
}
@Override
public String toString() {
	return "Book [" + super.toString() + "]";
}

}
