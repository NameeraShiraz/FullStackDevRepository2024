package com.gentech.returnmethods.assignments;
class OneDIntArray
{
	int[] getFirstHalf(int[] arr) {
        int[] a = new int[arr.length];
        for (int i = 0; i < a.length/2; i++) {
        a[i] = arr[i];
        }
        return a;
    }

	
}
public class Assign1 {

	public static void main(String[] args) {
		OneDIntArray o=new OneDIntArray();
		int b[]= {10,20,30,40,50,60};
		int c[]=o.getFirstHalf(b);
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=0)
			{
				System.out.print(c[i]+ " ");
			}
		}
		
	}

}
