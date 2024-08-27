package com.gentech.nestedclassesdemo;

class StudentOuter
{
	String SName;
	
	class StudentId
	{
		static int USN;
	}
	class StudentDetails
	{
		static String course;
		static char grade;
		static String city;
	}
	static void showdetails()
	{
		StudentOuter name = new StudentOuter();
		name.SName="Nageena";
		StudentOuter.StudentId.USN=1765;
		StudentOuter.StudentDetails.course="CSE";
		StudentOuter.StudentDetails.grade='A';
		StudentOuter.StudentDetails.city="Bangalore";

		System.out.println("Student name is: "+name.SName);
		System.out.println("USN :"+StudentOuter.StudentId.USN);
		System.out.println("Course :"+StudentOuter.StudentDetails.course);
		System.out.println("Grade :"+StudentOuter.StudentDetails.grade);
		System.out.println("City :"+StudentOuter.StudentDetails.city);
	}
}
public class Assign4 {
	public static void main(String[] args) {
		StudentOuter.showdetails();
		
	}

}
