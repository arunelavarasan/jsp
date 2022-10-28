import java.util.Random;
import java.util.Scanner;

public class QuickSort
{	
	public static void quicksort(int[] array,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int pivot = array[high];
		int lowIndex = low;
		int highIndex = high;
		while(lowIndex<highIndex)
		{
			while(array[lowIndex]<=pivot&&lowIndex<highIndex)
			{
				lowIndex++;
			}
			while(array[highIndex]>=pivot&&lowIndex<highIndex)
			{
				highIndex--;
			}
			swap(array, lowIndex,highIndex);
		}
		swap(array, lowIndex,high);
		quicksort(array,low,highIndex-1);
		quicksort(array, lowIndex+1, high);
	}
	private static void swap(int[] array, int lowIndex, int highIndex) {
		int temp = array[lowIndex];
		array[lowIndex] = array[highIndex];
		array[highIndex] =  temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		System.out.println("before sorting");
		printArray(a);
		System.out.println();
		System.out.println("after sorting");
		quicksort(a, 0, a.length-1);
		printArray(a);
	}
	private static void printArray(int [] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
/*
 * {5, 2, 4} [1=0, 4=1, 
 * 6
 * return {2, 1}
 */