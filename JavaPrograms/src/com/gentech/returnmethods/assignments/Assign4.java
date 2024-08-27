package com.gentech.returnmethods.assignments;
class DoubleArray
{
	double[] revOneDArray(double[] a)
	{
		double[] arr=new double[a.length];
		int j=0;
		for(int i=(a.length-1);i>=0;i--)
		{
			arr[j]=a[i];
			j++;
		}
		return arr;
	}
	
}
public class Assign4 {
	public static void main(String[] args) {
		DoubleArray o=new DoubleArray();
		double[] b= {14.2,2.76,34.5,4.6,51.5,6.9,12.5,45.7};
		double[] c=o.revOneDArray(b);
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+ " ");
		}
	}

}
