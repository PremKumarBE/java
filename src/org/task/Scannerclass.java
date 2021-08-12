package org.task;

import java.util.Scanner;

public class Scannerclass {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter name");
		String name=a.next();
		System.out.println("enter pin");
		int pin=a.nextInt();
		System.out.println("enter sal");
		float sal=a.nextFloat();
		System.out.println("enter phone num");
		long phonenum=a.nextLong();
		System.out.println("winthdraw");
		boolean withdraw=a.nextBoolean();
		
	}

}
