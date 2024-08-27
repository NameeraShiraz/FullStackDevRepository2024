package com.gentech.nestedclassesdemo;
class Outer1
{
	String Pname;
	
	class inner1
	{
		static String city;
		static int Pno;
	}
	
}
public class Assigb2 {
	public static void main(String[] args) {
		Outer1 n=new Outer1();
		n.Pname="Nameera";
		System.out.println("The Person's name is :"+n.Pname);
		
		Outer1.inner1.city="Bangalore";
		Outer1.inner1.Pno=984563387;
		System.out.println("The city name is : "+Outer1.inner1.city);
		System.out.println("Phone number is : "+Outer1.inner1.Pno);

	}

}
