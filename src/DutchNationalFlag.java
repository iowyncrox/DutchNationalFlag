import java.util.Arrays;

public class DutchNationalFlag {

	public static void segregateArray(int[] array) {

		int low = 0;
		int mid = 0;
		int high = array.length - 1;

		while (mid <= high) {
			switch (array[mid]) {
			case 0: {
				swap(array, low++, mid++);
				break;
			}

			case 1: {
				mid++;
				break;
			}

			case 2: {
				swap(array, mid, high--);
				break;
			}
			}
		}
	}

	private static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 2, 0, 1, 2, 2, 0, 1, 0, 2, 0, 2, 1, 1, 2, 0, 1, 0, 2 };
		segregateArray(array);
		System.out.println(Arrays.toString(array));
	}

}
