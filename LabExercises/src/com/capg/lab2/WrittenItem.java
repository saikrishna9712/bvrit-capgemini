package com.capg.lab2;

public abstract class WrittenItem extends Item {
private String author;

public String getAuthor() {
return author;
}
public void setAuthor(String author) {
	this.author=author;
}
public WrittenItem() {
	
}
public WrittenItem(int id,int copies,String title,String author) {
	super(id,copies,title);
	this.author=author;
}
@Override
public String toString() {
	return super.toString()+"WrittenItem [author=" + author + "]";
}




}
