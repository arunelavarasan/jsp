package String;
public class Assignment {
	public static void main(String[] args) {
		String a = "Welcome";
		System.out.println(a);
		System.out.print(reverse(a)+""+largestCount(a) +"\n");
		String b = "Maharashtra";
		System.out.println();
		System.out.println(b);
		System.out.print(reverse(b)+""+largestCount(b));
	}
	public static String reverse(String a) {
		String rev = "";
		for(int i = a.length()-1;i>=0;i--)
		{
			rev = rev + a.charAt(i);
		}
		return rev;
	}
	public static String largestCount(String a)
	{
		char[] c = a.toCharArray();
		boolean[] b = new boolean[c.length];
		int [] count = new int[c.length];
		
		for (int i = 0; i < b.length; i++) {
			count[i] = 1;
			if(b[i] == false)
			{
				for (int j = i + 1; j < b.length; j++) {
					if (c[i] == c[j]) {
						count[i]++;
						b[j] = true;
					}
				}
			}
		}
		for (int i = 0; i < count.length; i++) {
			for(int j = i+1;j<count.length; j++)
			{
				if(count[i] < count[j])
				{
					int temp1 = count[j];
					count[j] = count[i];
					count[i] = temp1;
					
					char temp2 = c[j];
					c[j] = c[i];
					c[i] = temp2;
				}
			}
		}
	return count[0] + "" + c[0];
	}
}

//I/P  = welcome
//O/P = emocleW2e

//I/P = Maharashtra
//O/P = arthsarahaM4a
