//WAP to find the string is anagram
package String;

public class Anagram {

	public static void main(String[] args) {
		String a1 = "cat";
		String a2 = "act";
		boolean b = true;
		if(a1.length() == a2.length())
		{
			char [] c1 = a1.toCharArray();
			char [] c2 = a2.toCharArray();
			sort(c1);
			sort(c2);
			for(int i = 0;i<c1.length;i++)
			{
				if(c1[i]!=c2[i])
				{
					b = false;
					break;
				}
			}
			if(b == true)
			{
				System.out.println("It is an Anagram");
			}
			else {
				System.out.println("Not an Anagram");
			}
		}
		else {
			System.out.println("Not an Anagram");
		}
	}

	public static void sort(char[] c1) {
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c1.length; j++) {
				if(c1[i] < c1[j])
				{
					char temp = c1[i];
					c1[i] = c1[j];
					c1[j] = temp;
				}
			}
		}
	}

}
