package com.gentech.returnmethods.assignments;
class OneDSum
{
	int SumArray(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+ a[i];
		}
		return sum;
	}
}
public class Assign2 {

	public static void main(String[] args) {
		OneDSum o= new OneDSum();
		int a[]= {10,20,30,40};
		int s=o.SumArray(a);
		
		System.out.println("The sum of all elements od 1D array are : "+s);

	}

}
