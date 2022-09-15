//WAP to find duplicate character
package String;

public class Duplicate {
	public static void main(String[] args) {
		String s = "maharashtra";
		char [] a = s.toCharArray();
		boolean [] b = new boolean[s.length()];
		for(int i = 0; i<s.length();i++)
		{
			if(b[i] == false)
			{
				int count = 1;
				for(int j = i+1;j<s.length();j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j] = true;
					}
				}
				if(count>1)
				{
					System.out.println(a[i] + " " + count);
				}
			}
		}
	}
}
