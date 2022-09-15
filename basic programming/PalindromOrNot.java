//WAP to check the number weather palindrom or not
package jsp;

public class PalindromOrNot {
	public static void main(String[] args) {
		int n = 212;
		int temp = n;
		int rev = 0;
		while(n!=0)
		{
			int d = n%10;
			rev = rev * 10 + d;
			n = n/10;
		}
		if(temp == rev)
		{
			System.out.println("The number is Palindrom number");
		}
		else {
			System.out.println("The number is not Palindrom number");
		}
	}
}

//212 == 212