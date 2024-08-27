package com.gentech.returnmethods.assignments;

class TableInp
{
	int[] tables(int num)
	{
		int[] table = new int[10];
		for(int i=1;i<10;i++)
		{
			table[i] = num * (i + 1);
		}
		return table;
	} 
}

public class Assign9
{

	public static void main(String[] args) 
	{
		TableInp t1=new TableInp();
		int num=Integer.parseInt(args[0]);
		int b[]=t1.tables(num);
		for (int i = 0; i<b.length ; i++) 
		{
            System.out.println(num+ " * " + (i + 1) + " = " + b[i]);
		}
		

	}

}
