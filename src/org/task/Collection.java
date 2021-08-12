package org.task;

import java.util.ArrayList;
import java.util.List;

public class Collection {
	public static void main(String[] args) {
		List<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		int size = a.size();
		System.out.println(size);
		for (int k=0;k<a.size();k++) {
		System.out.println(a.get(k));
		}
		boolean contains = a.contains(1000);
		System.out.println(contains);
		int lastIndexOf = a.lastIndexOf(3);
		System.out.println(lastIndexOf);
		List<Integer>bb=new ArrayList<Integer>();
		
		bb.add(1);
		bb.add(34);
		a.addAll(bb);
		System.out.println(a);
		Integer remove = a.remove(4);
		System.out.println(a);
		a.removeAll(bb);
		System.out.println(bb);
		a.retainAll(bb);
		System.out.println(bb);
		
		boolean equals = a.equals(bb);
		System.out.println(equals);
		
		
	}
}
		 

	
