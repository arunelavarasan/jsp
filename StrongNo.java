//WAP to find weather the no. is strong number or not
package jsp;

public class StrongNo {

	public static void main(String[] args) {
		int n = 145;
		int temp = n;
		int sum = 0;
		while(n!=0)
		{
			int d = n%10;
			sum = sum + factorial(d);
			n = n/10;
		}
		if(sum==temp)
		  {
			System.out.println("the no. is strong number");
		  }
		else {
			System.out.println("the no is not strong number");
		}
	  }
      public static int factorial(int d)
      {
	    int fact = 1;
	   for(int i = 1; i<=d ; i++)
	   {
		fact = fact*i;
	   }
	   return fact;
    }
}
//Separate
//factorial
//sum
//compare
