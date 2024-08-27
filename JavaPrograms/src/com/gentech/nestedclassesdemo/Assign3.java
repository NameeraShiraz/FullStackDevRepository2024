package com.gentech.nestedclassesdemo;
class OuterEmployeeNo
{
	private int eNo;
	
	private class innerEmployeeName
	{
		private String eName;
		
		public String geteName() {
			return eName;
		}
		public void seteName(String eName) {
			this.eName = eName;
		}
		
	}
	
	private class innerEmployeeDept
	{
		private int deptNo;

		public int getDeptNo() {
			return deptNo;
		}

		public void setDeptNo(int deptNo) 
		{
			this.deptNo = deptNo;
		}
		
	}
	
	public void useinnerEmployee()
	{
		innerEmployeeDept dept=new innerEmployeeDept();
		dept.setDeptNo(5);
		int DeptNo=dept.getDeptNo();
		System.out.println("The department name is: "+DeptNo);
		
		innerEmployeeName en=new innerEmployeeName();
		en.seteName("Nageena");
		String name=en.geteName();
		System.out.println("The employee name is "+name);
	}

	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	
}
public class Assign3 {

	public static void main(String[] args) 
	{
		
		OuterEmployeeNo emp=new OuterEmployeeNo();
		emp.seteNo(1001);
		int Empno=emp.geteNo();
		System.out.println("Employee no is :"+Empno);
		
		emp.useinnerEmployee();
		
	}

}



