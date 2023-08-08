package arrays;
//sinking sort/exchange sort/in place sorting
//it is a comparison based sorting algorithm which repeatedly compares and swaps adjacent elements 
//simple and easy to understand
//advised to use bubble sort on smaller arrays and data sets where performance is of less concern

public class bubbleSort {
	static void sortArr(int[] arr) {
		for(int j=0;j<arr.length-1;j++) {
			for(int i=1; i<arr.length-j; i++) {
				int temp = arr[i-1];
				if(arr[i]<temp) {
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}	
	
	public static void main(String[] args) {
		int[] arr = {678990987,4599617,276554,84568,298,16};
		sortArr(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
