//same method and signature

package com.gentech.inheritance;
class Person
{
	void display(String name)
	{
		System.out.println("Person name is: "+name);
	}
}
class personPh extends Person
{
	void display(String name)
	{
		super.display(name);
		System.out.println("Phone no. of "+name+" is 86676876");
	}
}
class personstat extends personPh
{
	void display(String name)
	{
		super.display(name);
		System.out.println("Status of "+name+" is Single");
	}
}
public class Assign7 {
	public static void main(String[] args) {
		personstat o=new personstat();
		o.display("Santosh");
	}

}
