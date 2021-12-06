package FindBinary;

public class FindBinaryClass {
	public static void main(String[] args) {
		System.out.println(findBinary(5612, ""));
		int[] arr = {2,5,6,7,8,9}; //MUST be sorted;
		System.out.println(binarySearch(arr, 0, arr.length - 1, 7));
	}
	
	public static String findBinary(int value, String input) {
		if (value == 0) return input;
		
		input += value % 2;
		
		return findBinary(value / 2, input);
	}
	
	public static int binarySearch(int[] arr, int left, int right, int value) {
		if (left > right) return -1;
		
		int mid = (left + right) / 2;
		
		if (value == arr[mid]) return mid;
		
		if (value < arr[mid]) return binarySearch(arr, left, mid-1, value);
		
		return binarySearch(arr, mid+1, right, value);
	}
	
}
