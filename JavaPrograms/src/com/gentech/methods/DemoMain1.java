package com.gentech.methods;
class Sum1To10
{
	void SumNum(int x,int y)
	{
		int sum=0;
		for(int i=1;i<=50;i++)
		{
				sum+=i;		
		}
		System.out.println("the sumof "+x+" and "+y+" is "+sum);
	}
}
public class DemoMain1 {

	public static void main(String[] args) {
		Sum1To10 o=new Sum1To10();
		o.SumNum(1,50);

	}

}
