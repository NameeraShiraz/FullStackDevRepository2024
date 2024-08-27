package com.gentech.methods;
class Divi
{
	void div()
	{
		int count=0;
		for(int i=50;i<=150;i++)
		{
			if(i%6==0)
			{
				count=count+1;
			}
		}System.out.println("The count of no divisible by 6 from 50 to 150 are: "+count);
	}
}
public class DemoMain2 {

	public static void main(String[] args) {
		Divi o=new Divi();
		o.div();

	}

}
