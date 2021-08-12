package org.task;

public class Abstarctcloth implements AbstractFul {

	@Override
	public void ages() {
		// TODO Auto-generated method stub
		System.out.println("19");
		
	}

	@Override
	public void names() {
		// TODO Auto-generated method stub
		System.out.println("prem");
		
	}

	@Override
	public void gender() {
		// TODO Auto-generated method stub
		System.out.println("men");
		
	}
	public static void main(String[] args) {
		Abstarctcloth a=new Abstarctcloth();
		a.ages();
		a.names();
		a.gender();
	}

}
