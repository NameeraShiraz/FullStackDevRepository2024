package com.gentech.nestedclassesdemo;

class OuterEmployee
{
	private int eNo;
	private String eName;
	
	
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
	
	public void useinnerEmployeeDept()
	{
		innerEmployeeDept dept=new innerEmployeeDept();
		dept.setDeptNo(5);
		
		int DeptNo=dept.getDeptNo();
		System.out.println("The department name is: "+DeptNo);
	}

	public int geteNo() {
		return eNo;
	}
	public void seteNo(int eNo) {
		this.eNo = eNo;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
}
public class Assign1 {
	public static void main(String[] args) {
		OuterEmployee emp=new OuterEmployee();
		emp.seteNo(1001);
		emp.seteName("Nageena");
		
		int Empno=emp.geteNo();
		System.out.println("Employee no is :"+Empno);
		
		String name=emp.geteName();
		System.out.println("The employee name is "+name);
		
		emp.useinnerEmployeeDept();
	}

}
