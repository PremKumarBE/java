package org.task;

public class Abstractexte extends Abstract {

	@Override
	public void names() {
		// TODO Auto-generated method stub
		System.out.println("prem");       //partial Abstract
		
		
		
	}

	@Override
	public void ages() {
		// TODO Auto-generated method stub
		System.out.println("21");
		
		
	}

	@Override
	public void gender() {
		// TODO Auto-generated method stub
		System.out.println("men");
		
	}
	public static void main(String[] args) {
		Abstractexte a=new Abstractexte();
		a.lists();
		a.ages();
		a.names();
		a.gender();
	}

}
