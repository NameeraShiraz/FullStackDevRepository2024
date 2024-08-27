//instance block
package com.gentech.abstractassignments;
abstract class Student2
{
	 
	{
		System.out.println("The Student name is Ramesh");
	}
}
class Studentsdetails2 extends Student2
{
	void disp()
	{
		System.out.println("studies in SJCIT");
	}
}
public class Assign3 {
	public static void main(String[] args) {
		Studentsdetails2 o =new Studentsdetails2();
		o.disp();
		

	}

}
