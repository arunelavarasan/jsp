package Sorting;

import java.util.Random;
import java.util.Scanner;

public class CountSort {
	private static void count(int[] a,int large) {
		int count[] = new int[large+1];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			count[a[i]] = count[a[i]] + 1;
		}
		for (int i = 1; i < count.length; i++) {
			while(count[i]!=0)
			{
				a[k++] = i;
				count[i]--;
			}
		}
	}
	public static void main(String[] args) {
		int a[] = new int[10];
		randomNumber(a);
		printArray(a);
		count(a,largest(a));
		printArray(a);
	}
	private static int largest(int[] a) {
		int largest = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>largest)
			{
				largest = a[i];
			}
		}
		return largest;
	}
	public static void randomNumber(int[] a){
    	Scanner sc = new Scanner(System.in);
		Random random = new Random();
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(100);
		}
		sc.close();
    }
    private static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
