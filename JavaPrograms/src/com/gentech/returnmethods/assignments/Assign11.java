package com.gentech.returnmethods.assignments;

class ConcatStringArray
{   
	
	String[] cancat(String a[])
	{   
		String res[]=new String[a.length];
		String s=" ";
		for(int i=0;i<a.length;i++)
		{
			res[i]=s+a[i]; 
		}
		return res;
	}
	
}

public class Assign11 {

	public static void main(String[] args) {
	
		ConcatStringArray c1=new ConcatStringArray();
		String b[]= {"I","am","Nameera","Shiraz"};
		String c[]=c1.cancat(b);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
		}
	
	}

}
