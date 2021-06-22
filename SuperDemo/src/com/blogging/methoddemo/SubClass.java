package com.blogging.methoddemo;

public class SubClass extends MainClass{
	int a;
	 public void print() {
		 System.out.println(a+" Child class variable");
		 super.print();//Calling super class method. 
	 }
	 	

}
