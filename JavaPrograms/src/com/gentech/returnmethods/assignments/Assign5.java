package com.gentech.returnmethods.assignments;

class Factorial
{
	int fact(int num)
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		return f;
	}
}
public class Assign5 {

	public static void main(String[] args) {
		Factorial f1=new Factorial();
		int f=f1.fact(5);
		System.out.println(f);

	}

}
