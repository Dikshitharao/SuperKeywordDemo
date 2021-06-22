package com.blogging.superdemo;

public class ChildClass extends MainClass {
	int a;
	 public void print() {
		 System.out.println(a+" Child class variable");
		 System.out.println(super.a+" Parent class variable printing from child class using super");
		 //referring to parent class variable 'a' using super keyword and .(dot) operator.
		 
	 }
}
