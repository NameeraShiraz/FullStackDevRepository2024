package com.gentech.returnmethods.assignments;
class OneDShortArray
{
	short[] secondHalf(short[] a)
	{
		int h=a.length/2;
		short[] arr=new short[a.length];
		for(int i=h;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		return arr;
	}
}
public class Assign3 {
	public static void main(String[] args) {
		OneDShortArray o=new OneDShortArray();
		short[] a= {10,20,30,40,50,60};
		short[] c=o.secondHalf(a);
		
	
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=0)
			{
				System.out.print(c[i]+ " ");
			}
			
		}
		
	}

}
