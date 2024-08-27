package com.gentech.assignments;

class SumOfDigits
{   
	void sumdigits(String args[])
	{   
		int sum=0;
		int num=Integer.parseInt(args[0]);
		boolean Isnegative=num<0;
		int tempnum=Isnegative ? -num:num;
	
		while(tempnum>0)
		{
			sum=sum+(tempnum%10);
			tempnum=tempnum/10; 	
		}
		if(Isnegative)
		{
			sum=-sum;
		}
		System.out.println(sum);
		
	}
}

public class Assign7
{

	public static void main(String[] args) 
	{
		SumOfDigits s1=new SumOfDigits();
		s1.sumdigits(args);
	}

}
