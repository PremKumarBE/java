package org.task;

public class PolyOR extends Polymorphism {
	public void name(int id) {
		System.out.println(id);
	}


	public static void main(String[] args) {
		PolyOR a=new PolyOR();
		a.name(123);
		a.name(567);
		a.name(8910);
	}
}

	
