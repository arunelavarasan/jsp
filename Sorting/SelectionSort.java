//WAP to sort the element of ascending order using Selection Sort
package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a = {4, 3, 1, 5, 2};
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i+1; j < a.length; j++) {
				if(a[min] > a[j])
				{
					min = j;
				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
