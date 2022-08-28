package Sorting;

public class Insertion {

	public static void main(String[] args) {
		int [] a = {3, 4, 6 ,2, 5, 1}; //3, 4, 2, 6, 5, 1
		for(int i = 1 ;i<a.length ;i++)//4
		{
			int temp = a[i];//5
			int j = i;//3
			while(j>0 && temp<a[j-1])//
			{
				a[j] = a[j-1]; 
				j = j - 1;
			}
			a[j] = temp;
		}
		//print the element of an array
		for(int i = 0 ;i<a.length ;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}
