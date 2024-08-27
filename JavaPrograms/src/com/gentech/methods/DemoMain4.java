package com.gentech.methods;
class TwoDArray
{
	void Concat(char a[][])
	{
		String s=" ";
		
		
			for(int j=0;j<a[  0].length;j++)
			{
				s=s+              a[0][j];
				
			}
		System.out.println(s);
	}
}
public class DemoMain4 {

	public static void main(String[] args) {
		char b[][]= {{'A','B','C'},{'X','Y','Z'}};
		TwoDArray o=new TwoDArray();
		o.Concat(b);
	}

}
