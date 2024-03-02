package practice; // Write a Java program to reverse an array without using an additional array?


public class ArrayReverse {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		reverseArray(array);
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void reverseArray(int[] arr) {
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
			arr[start] = arr[start] + arr[end] - (arr[end] = arr[start]);
		}
	}
}








/* Other way
public class ReverseArray {

public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    reverseArray(array);
    System.out.println("Reversed Array:");
    for (int num : array) {
        System.out.print(num + " ");
    }
}

public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        // Swap elements at start and end indices
        arr[start] = arr[start] + arr[end];
        arr[end] = arr[start] - arr[end];
        arr[start] = arr[start] - arr[end];
        start++;
        end--;
    }
}
}

*/