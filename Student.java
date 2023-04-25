package com.cruds.demo;

public class Student {
 int rollno;
 String name;
public Student(int rollno, String name) {
	super();
	this.rollno = rollno;
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

 public void printInfo()
 {
	 System.out.println("name : " + name + " rollno : " + rollno);
 }

}
 
 
 
 
 

