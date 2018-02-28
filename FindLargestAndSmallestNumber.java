
/**
 * 
 * @author gowtham pr
 *         <p>
 *         Prints the largest and smallest number from the given input array
 */
public class FindLargestAndSmallestNumber {

	public static void main(String[] args) {

		int inputArray[] = { 1, 123, 1, 1, 4, 5, 73, 57, 88, 23, 76, 7646, 3654, 3, 4, 5, 1, 38, 0, 5, 32, 5, 67, 4 };

		System.out.println("Large no: " + findLargest(inputArray));
		System.out.println("Small no: " + findSmallest(inputArray));
	}

	/**
	 * Returns the smallest number in the array
	 * 
	 * @param inputArray
	 * @return
	 */
	private static int findSmallest(int[] inputArray) {
		int pivot = inputArray[0];

		for (int i = 1; i < inputArray.length; i++) {

			if (inputArray[i] < pivot) {
				pivot = inputArray[i];
			}
		}

		return pivot;
	}

	/**
	 * Returns the largest number in the array
	 * 
	 * @param inputArray
	 * @return
	 */
	private static int findLargest(int[] inputArray) {
		int pivot = inputArray[0];

		for (int i = 1; i < inputArray.length; i++) {

			if (inputArray[i] > pivot) {
				pivot = inputArray[i];
			}
		}

		return pivot;
	}
}
