package com.gentech.returnmethods.assignments;

class Char2D
{
	char[][] charA(char a[][])
	{
        char[][] res = new char[a.length][a[0].length];
		for(int j=0;j<a[0].length;j++)
		{
			res[0][j]=a[0][j];
		}
		
		return res;
	}
}

public class Assign7 
{

	public static void main(String[] args) 
	{
		Char2D a4=new Char2D();
		char b[][]= {{'h','e','l','l','o'},{'h','i'}};
		char c[][]=a4.charA(b);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]);
			}
			System.out.println();
			
		}
        
	}
}