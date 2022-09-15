//WAP to print shortest string form the string array (array should not contain same length of string)
package String; 

public class interviewQ3 {

	public static void main(String[] args) {
		String[] s = { "goa", "daman", "thane", "mumbai", "mahabaleshwar" };
		int small = 0;
		for(int i = 0;i<s.length;i++)
		{
			if(s[i].length()<s[small].length())
			{
				small = i;
			}
		}
		System.out.print(s[small]);
	}

}
