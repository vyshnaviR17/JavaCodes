//Inserting an element at a specified index
package arrays;
public class inssertEle {
	public static void main(String[] args) {
		int[] arr = {8,9,7,5,4,1,6};
		int indexToAdd = 3;
		int eleToAdd = 2;
		int temp = arr[indexToAdd];
		int[] updatedArr = new int[arr.length+1];
		if(indexToAdd<0 && indexToAdd>arr.length-1) {
			System.out.println("Invalid index");
		}else {
			for(int i=0; i<updatedArr.length-1; i++) {
				if(i==3) {
					updatedArr[i] = eleToAdd;
				}else {
					updatedArr[i] = arr[i];
				}
			}
		}
		updatedArr[arr.length] = temp;
		for(int i=0; i<updatedArr.length; i++) {
			System.out.print(updatedArr[i]+" ");
		}
	}
}

//count duplicates in an array
public class CountDuplicateEle {
	public static void main(String[] args) {
		int[] arr = {2,2,3,4,3,4,5,5,8,8,1,1,0};
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}

//print the duplicate elements in an array
public class DisplayDuplicateEle {
	public static void main(String[] args) {
		int[] arr = {2,6,6,4,5,9,2,3,7,8};
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
				}
			}
		}
	}
}
  
