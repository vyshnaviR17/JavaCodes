package arrays;
//Time complexity : O(n log n)
//In place sorting algorithm
//deletion in heapSort
public class heapSort {
	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 2, 4};
		int n = arr.length;
		//deleting the root
		n = deleteRoot(arr, n);
		n = deleteRandom(arr, 3, n); //deleting the element in index 3
		//buidHeap(arr, n);
		printArray(arr, n);
    private static void printArray(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}		
	}
	
	//if we want to delete middle element suppose say element at index 3
	static int deleteRandom(int[] arr, int i, int n) {
		int lastElement = arr[n - 1];
		arr[i] = lastElement;
		n = n-1;
		heapify(arr, n, i);
		return n;
	}
	
	//function for deleting root
	static int deleteRoot(int[] arr, int n) {
		int lastElement = arr[n-1];
		arr[0] = lastElement;
		n = n-1;
		//heapifying the root node(i.e, converting the tree into heap)
		heapify(arr, n, 0);
		return n;
	}
	
	//converting the binary tree into heap structure(either max or min[here we are demonstrating max heap])
	static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int left = 2 * i + 1;//in case of arrays 2*i becomes 2*i+1
		int right = 2 * i + 2;//in case of arrays 2*i+1 becomes 2*i+2
		
		if(left<=n && arr[left] > arr[largest]) {
			largest = left;
		}
		if(right<=n && arr[right] > arr[largest]) {
			largest = right;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			
			heapify(arr, n, largest);
		}
	}
}
