package org.task;

public class Stringuse {
	public static void main(String[] args) {
		String a="prem";
		String b="kumar";
		int length = a.length();
		System.out.println(length );
		boolean equals = a.equals(b);
		System.out.println(equals );
		boolean equalsIgnoreCase = a.equalsIgnoreCase(a);
		System.out.println(equalsIgnoreCase );
		String upperCase = a.toUpperCase();
		System.out.println(upperCase );
		String lowerCase = a.toLowerCase();
		System.out.println(lowerCase );
		String trim = a.trim();
		System.out.println(trim );
		String substring = a.substring(1, 3);
		System.out.println(substring );
		String replace = a.replace('p', 'k');
		System.out.println(replace );
		String replaceAll = a.replaceAll("pre", "kummmmmmmm");
		System.out.println(replaceAll);
		int compareTo = a.compareTo("pr");
		System.out.println(compareTo );
		boolean contains = a.contains(b);
		System.out.println(contains );
		String[] j = b.split("");
		for (int i=0;i<=b.length();i++) {
		System.out.println(j[i]);
		}
	}
}
		
	   	
	   	
	   	
	   	
	   	
	   	
	   	

	   	
	   	
	   	
	   	

