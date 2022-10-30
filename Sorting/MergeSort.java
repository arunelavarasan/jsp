package Sorting;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(int[] array)
	{
		int inputSize = array.length;
		if(inputSize<2)
		{
			return;
		}
		int mid = inputSize/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[inputSize-mid];
		for(int i=0;i<mid;i++)
		{
			leftArray[i] = array[i];
		}
		for(int i=mid;i<inputSize;i++)
		{
			rightArray[i-mid] = array[i];
		}
		mergeSort(leftArray);
		//printArray(leftArray);
		mergeSort(rightArray);
		//printArray(rightArray);
		merge(array, leftArray, rightArray);
	}
	public static void merge(int[] a,int[] left,int[] right)
	{
		int leftSize = left.length;
		int rightSize = right.length;
		int i=0,j=0,k=0;
		while(i<leftSize&&j<rightSize)
		{
			if(left[i]<=right[j])
			{
				a[k] = left[i];
				i++;
			}
			else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<leftSize)
		{
			a[k] = left[i];
			i++;
			k++;
		}
		while(j<rightSize)
		{
			a[k] = right[j];
			j++;
			k++;
		}
	}
	public static void main(String[] args) {
		int a [] = new int[10];
		randomNumber(a);
		System.out.println("Before sorting");
		System.out.println("---------------------");
		printArray(a);
		System.out.println("After sorting");
		System.out.println("---------------------");
		mergeSort(a);
		printArray(a);
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
