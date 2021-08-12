package org.task;

public class ConstructSup  {
	public ConstructSup() {
		System.out.println("prem");
		
	}
	public ConstructSup(float sal){
		this(false);
		System.out.println(sal);
		
	}
	public ConstructSup(boolean withdrw) {
		
		System.out.println(withdrw);
		
	}

}
