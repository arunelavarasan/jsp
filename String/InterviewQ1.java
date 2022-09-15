package String;

public class InterviewQ1 {
	public static void main(String[] args)
	{
		String s = "Meet me at the clock tower";
		String[] a = s.split(" ");
		for(int i = 0;i<a.length;i++)
		{
			if(i%3==0)
			{
				System.out.print(vowel(a[i]) + " ");
			}
			if(i%3==1)
			{
				System.out.print(consonent(a[i]) + " ");
			}
			if(i%3==2)
			{
				System.out.print(upperCase(a[i]) + " ");
			}
		}
	}
	public static String vowel(String s)
	{
		char [] c = s.toCharArray();
		for(int i = 0; i<c.length;i++)
		{
			if(c[i]=='a'|| c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||
					c[i]=='A'||c[i]=='O'||c[i]=='I'||c[i]=='U')
			{
				c[i] = '%';
			}
		}
		s = new String(c);
		return s;
	}
	public static String consonent(String s)
	{
		char [] c = s.toCharArray();
		for(int i = 0;i<c.length;i++)
		{
			if(!(c[i]=='a'|| c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||
					c[i]=='A'||c[i]=='O'||c[i]=='I'||c[i]=='U'))
			{
				c[i] = '%';
			}
		}
		return s;
	}
	public static String upperCase(String s)
	{
		char[] c = s.toCharArray();
		for(int i = 0;i<s.length();i++)
		{
			if(c[i] >= 'a' && c[i] <='z')
			{
				c[i]=(char)(c[i] - 32);
			}
		}
		s = new String(c);
		return s;
	}
}
//if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='O'||c[i]=='I'||c[i]=='U')
//{
//	c[i] = '%';
//}
