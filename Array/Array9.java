//WAP to take element form user and display the elements present in array 
package Array;
import java.util.*;
public class Array9 {

	public static void main(String[] args) {
		Scanner sc = null;
	    sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int [] a = new int [n];
		for(int i = 1 ;i<a.length; i++)
		{
			System.out.println("Enter the elements");
			a[i] = sc.nextInt();
		}
		for(int i = 1;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		if(sc!=null)
		{
			sc.close();
		}
	}
}
//syntax to create an object for array
//datatype[] var = new datatype[size];
