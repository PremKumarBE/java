package org.task;

import java.util.ArrayList;

public class Forloop {
	public static void main(String[] args) {
		
		
		//for (int i=0;i<=10;i++) {
		//int i=1324;
		int[] a= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//for (int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
		
		for (int j:a) {
			System.out.println(j);
}
		
		if(a.length==5) {
			System.out.println("length is"+a.length);
		}
	
		else {
			System.out.println("length is wrong");
		}
	}
}
	
	
	

				