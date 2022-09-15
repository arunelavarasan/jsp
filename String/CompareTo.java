//WAP to print all the values in lexicographical order
package String;

public class CompareTo {

	public static void main(String[] args) {
		String[] s = {"goa","daman","manali","kasol","mahabaleshwar"};
		for(int i = 0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])>0)
				{
					String temp = s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i] + " ");
		}
	}
//d=100  g = 103     -3
}
