package Searching;

public class Linear1 {

	public static void main(String[] args) {
		char [] a = { 'c', 'h', 'i','n','m','a','y'};
		char search = 'i';
		boolean b = true; //not present
		for(int i = 0 ; i<a.length;i++)
		{
			if(a[i] == search)
			{
				System.out.println("The element is present: "+ i);
				b = false;
				break;
			}
		}
		if(b == true)
		{
			System.out.println("The element is not present");
		}
	}

}
