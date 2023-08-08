package arrays;

//Merge Sort is widely used sorting algorithm which uses divide and conquer methods approach
//it consistent and compatible for large data sets 
//it is a stable sorting and in place sorting algorithm.
//It has a time complexity of O(n log n)
//it is also used for sorting linked lists
//it requires additional space complexity
//it is not suitable for smaller data sets due to additional overhead because of recursion.

import java.util.Arrays;

public class mergeSort {
	public static void main(String[] args) {
		int[] arr = {21,23,43,12,54,27,58,90};
		mergesort(arr);
		for(int num : arr) {
			System.out.println(num);
		}
	}
	static int[] mergesort(int[] arr) {
		if(arr.length == 1) {
			return arr;
		}
		
		int mid  = arr.length / 2;
		
		int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
		int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left, right);
	}
	
	private static int[] merge(int[] first, int[] second) {
		int[] newArr = new int[first.length + second.length];
		int i =0;
		int j = 0;
		int k = 0;
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				newArr[k] = first[i];
				i++;
			}
			else {
				newArr[k] = second[j];
				j++;
			}
			k++;
		}
		while(i<first.length) {
			newArr[k] = first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			newArr[k] = second[j];
			j++;
			k++;
		}
		return newArr;
	}
}
