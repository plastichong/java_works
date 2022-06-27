package array;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {10,20,30,40,};
		int[] array2 = new int[4];
		

		for(int i = 0; i <array.length;i++) {
			array2[i] = array[i];
			System.out.println(array2[i]);
		}
		
		char[] arr1 = {'N','E','T'};
		char[] arr2 = new char[3];
		char[] arr3 = new char[3];
		
		for(int i = 0; i <arr1.length;i++) {
			arr2[i]=arr1[i];
			System.out.println(arr2[i]);
		}
		
		for(int i = 0; i < arr3.length ; i++) {
			arr3[2-i] = arr1[i];
			System.out.println(arr3[i]);
		}
	
	
	}

}
