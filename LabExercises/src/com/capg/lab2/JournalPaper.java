package com.capg.lab2;

public class JournalPaper extends WrittenItem {
private int year;
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year=year;
}
public JournalPaper(int Year) {
	this.year=year;
}
public void checkIn() {
	System.out.println("check-in");
	}
public void checkOut() {
	System.out.println("check out");
	
}
public void addItem() {
	System.out.println("Item Added");
	
}
//
public int checkIn(int id) {
	return id;
}
public int checkIn(int id,int copies) {
	return id+copies;
}
public int checkIn(int id,int copies,String title) {
	return id+copies;
}
public JournalPaper() {}
public JournalPaper(int id,int copies,String title,String author,int year) {
	super(id,copies,title,author);
    this.year=year;
}
@Override
public String toString() {
	return "JournalPaper [year=" + year + "]"+super.toString();
}


}
