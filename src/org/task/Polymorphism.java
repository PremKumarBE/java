package org.task;

public class Polymorphism {
	public void name() {
			System.out.println("prem");
	}
	public void name(String name) {
		System.out.println(name);
		
	}
	public void name(int id) {
		System.out.println(id);
	}
	public static void main(String[] args) {
		 Polymorphism a=new  Polymorphism();
		 a.name();
		 a.name("premkumar");
		 a.name("0021");
		
   //overloading
	}
		

}
