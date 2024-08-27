package com.gentech.string;

public class Assign3 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Nameera Shiraz");
		System.out.println("Original String :"+s);
		s.delete(8,14);
		
		CharSequence s1 = "and Nageena";  
		StringBuffer s2=s.insert(8,s1);
		System.out.println("Replaced String :"+s2);
	
	}

}
