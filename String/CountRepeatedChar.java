//WAP to find occurrence of each character
package String;

public class CountRepeatedChar {

	public static void main(String[] args) {
		String s = "maharashtra";
		char [] a = s.toCharArray();
		boolean [] b = new boolean[s.length()];
		for(int i = 0; i<a.length;i++)
		{
			if(b[i] == false)
			{
				int count = 1;
				for(int j = i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
						b[j] = true;
					}
				}
				System.out.println(a[i] + " " + count);
			}
		}
	}
}
