//use constructor
package com.gentech.inheritance;
class Student
{
	Student(String Sname)
	{
		Sname="Santosh";
		System.out.println("Student Name : "+Sname);
	}
}
class studentUSN extends Student
{
	studentUSN(String Sname) 
	{
		super(Sname);
	}
	void USN(String usn)
	{
		System.out.println("USN : "+usn);
	}
}
class studentCourse extends studentUSN
{
	studentCourse(String Sname) 
{
		super(Sname);
		
	}

	void course(String course)
	{
		System.out.println("Course : "+course);
	}
}
public class Assign4 {
	public static void main(String[] args) {
		studentCourse o = new studentCourse("CSE");
		o.course("CSE");
		o.USN("1KN24746");
	}

}
