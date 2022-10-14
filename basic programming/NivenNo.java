//WAP the program to find weather the no. is niven number or not
package jsp;

public class NivenNo {

	public static void main(String[] args) {
		int n = 27;
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int d = n%10;
			sum = sum + d;
			n = n/10;
		}
		if(temp%sum==0)
		{
			System.out.println("the number is niven");
		}
		else {
			System.out.println("The number is not niven");
		}
	}
}

//logic
//27 = 2 + 7 = 9  27/9 divisible
//21 = 2 + 1 = 3 21/3 divisible 

