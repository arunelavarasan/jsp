//WAP to swap variable without 3rd variable
package jsp;

public class Swapwithout3rdvar {
	
	public static void main(String[] args)
	{
	  int a = 34;
	  int b = 5;
	
	  System.out.println("----Before Swapping-----");
	  System.out.println(a);
	  System.out.println(b);
	  
	  a=a+b;
	  b=a-b;
	  a=a-b;
	  
	  System.out.println("----After Swapping-----");
	  System.out.println(a);
	  System.out.println(b);
	}
}
//Logic
//----------
//a=a+b  34+5=39  
//b=a-b  39-5=34
//a=a-b  39-34=5
