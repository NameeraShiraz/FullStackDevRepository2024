package com.gentech.string;

public class Assign2 {
	public static void main(String[] args) {
		String s="Nameera Shiraz";
		String s1="";
		char ch;
		System.out.println("Original String :"+s);
		for(int i=0;i<s.length();i++)
		{
			ch=s.charAt(i);
			s1=ch+s1;
		}
		System.out.println("Reverse String is :"+s1);
	
	}

}
