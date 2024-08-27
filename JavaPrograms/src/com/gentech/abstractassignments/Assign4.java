//return value
package com.gentech.abstractassignments;
abstract class Animal
{
	abstract String[] animalNames(String a[]);
}
class dispNames extends Animal 
{
	String[] animalNames(String a[])
	{
		String arr[]= new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			arr[i]=a[i];
		}
		return arr;
	}
}
public class Assign4 {
	public static void main(String[] args) {
		String b[]= {"Dog","Cat"};
		dispNames o=new dispNames();
		String c[]=o.animalNames(b);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
