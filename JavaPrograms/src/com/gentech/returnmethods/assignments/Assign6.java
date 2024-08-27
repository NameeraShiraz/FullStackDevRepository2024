package com.gentech.returnmethods.assignments;

class Square1To10
{
	int[] square()
	{
		int sq[]=new int[10];
		for(int i=0;i<10;i++)
		{
			sq[i]=(i+1)*(i+1) ;
			
		}
		return sq;
	}
}
public class Assign6 {

	public static void main(String[] args) {
		Square1To10 s1=new Square1To10();
		int square[]=s1.square();
		for(int j=0;j<square.length;j++)
		{
			System.out.println(square[j]);
		}
		 	

	}

}
