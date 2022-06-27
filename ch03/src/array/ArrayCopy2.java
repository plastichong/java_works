package array;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4};
		int[] arr2 = new int[4];
		int[] arr3 = new int[4];
		
		
		System.arraycopy(arr, 0, arr2, 0, 4);
		
		for(int i = 0 ;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
	
		arr3 = arr2.clone();
	System.out.println("==============");
		for(int i : arr3) {
			System.out.println(i);
		}
	}

}
