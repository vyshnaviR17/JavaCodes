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
----------------------------------------------
  
