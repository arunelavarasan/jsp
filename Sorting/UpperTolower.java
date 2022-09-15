//WAP to convert all the char of the array into lowercase
package Sorting;

public class UpperTolower {

	public static void main(String[] args) {
		char [] a = {'A', 'r', 'u', 'n',' ','E','l','A','v','a','r','s','a','N'};
		
		for (int i = 0; i < a.length; i++) {
			if((int)a[i] > 64 && (int)a[i] < 91 )
			{
				a[i]=(char)(a[i]+32);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
	}
}
// A --> 65  B-->66
// a --> 97  b--> 98
