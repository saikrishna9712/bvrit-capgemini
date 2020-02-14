package com.capg.lab2;

public abstract class Item {
private int id,copies;
private String title;

public abstract void checkIn();
public abstract void checkOut();
public abstract void addItem();

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCopies() {
	return copies;
}
public void setCopies(int copies) {
	this.copies = copies;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Item() {}
public Item(int id,int copies,String title) {
	this.id=id;
	this.title=title;
	this.copies=copies;
}
@Override
public String toString() {
	return "Item [id=" + id + ", copies=" + copies + ", title=" + title + "]";
}

}