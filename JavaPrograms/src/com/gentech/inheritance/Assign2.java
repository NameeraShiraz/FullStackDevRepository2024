//Hybrid
package com.gentech.inheritance;
class Hospital
{
	void HospitalName(String nam)
	{
		System.out.println("Hospital Name : "+nam);
	}
}
class Patient extends Hospital
{
	void PatientName(String name)
	{
		System.out.println("Patient Name :"+name);
	}
}
class location extends Hospital
{
	void Loc(String loc)
	{
		System.out.println("Location : "+loc);
	}
}
class Depart extends Hospital
{
	void Dept(String Dept)
	{
		System.out.println("Department :"+Dept);
	}
}
class Doctor extends Depart
{
	void doc(String doc)
	{
		System.out.println("Doctor : "+doc);
	}
}
public class Assign2 {
	public static void main(String[] args) {
		Doctor o=new Doctor();
		o.HospitalName("Fortis Hospital");
		o.Dept("Cardiology");
		o.doc("Amit");
		
		Patient o1=new Patient();
		o1.PatientName("Suresh");
		
		location o2=new location();
		o2.Loc("Rajaji Nagar, Bangalore");

	}

}
