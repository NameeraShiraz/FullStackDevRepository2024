package com.gentech.returnmethods.assignments;

class TableSeven
{
	int[] tableS(int num)
	{
		int[] t = new int[10];
		int k=0;
		for(int i=1;i<=10;i++)
		{
			t[k] = num * i;
			k++;
		}
		return t;
	} 
}

public class Assign8 
{

	public static void main(String[] args) 
	{
		TableSeven t1=new TableSeven();
		int k[]=t1.tableS(7);
		for (int i = k.length-1; i>=0 ; i--) 
		{
			
            System.out.println("7 * " + (i + 1) + " = " + k[i]);
		}
		

	}

}
