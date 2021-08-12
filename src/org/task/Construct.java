package org.task;

public class Construct extends ConstructSup {
	public Construct(){
		this("kumar");
		System.out.println("default prem");
	}
	public Construct(String name){
		this(1999);
		System.out.println(name);
	}
	public Construct(int id){
		super(9616f);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Construct a=new Construct();
	}

}

//construc by usis this keyword