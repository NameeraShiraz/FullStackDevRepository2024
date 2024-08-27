package com.gentech.methods;
class OneDArray{
	void Rev(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
public class DEmoMain3 {						

	public static void main(String[] args) {
		int b[]= {10,20,30,40};
		OneDArray o= new OneDArray();
		o.Rev(b);
	}

}
