//Satic block
package com.gentech.abstractassignments;
abstract class Student
{
	static 
	{
		System.out.println("The Student name is Santosh");
	}
}
class Studentsdetails extends Student
{
	void disp()
	{
		System.out.println("studies in KNSIT");
	}
}
public class Assign2 {
	public static void main(String[] args) {
		Studentsdetails o =new Studentsdetails();
		o.disp();
		
	}

}
