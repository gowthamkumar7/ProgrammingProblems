package problem;

/**
 * @author gowtham.paidi
 * 
 * 
 *         https://leetcode.com/problems/find-numbers-with-even-number-of-
 *         digits/
 *
 */
public class EvenNumberDigit {
	static int counter = 0;

	public static void main(String[] args) {

		int nums[] = { 1, 22, 3, 44, 522, 134, 5654, 3476, 73456 };

		oneMsSolution(nums);
		twoMsSolution(nums);

	}

	private static void twoMsSolution(int[] nums) {

		for (int f = 0; f < nums.length; f++) {

			String numstr = Integer.toString(nums[f]);

			if (isEven(numstr.toCharArray().length)) {

				counter++;
			}

		}

		System.out.println("Even Number of Digits ::" + counter);

	}

	private static void oneMsSolution(int[] nums) {
		int evenCounter = 0;
		for (int f = 0; f < nums.length; f++) {

			counter = 0;
			int number = nums[f];
			getDigitCount(number);
			if (isEven(counter)) {
				evenCounter++;
				counter = 0;
			}
		}

		System.out.println(evenCounter);
	}

	public static void getDigitCount(int number) {

		if (number != 0) {
			number = number / 10;
			counter++;
			getDigitCount(number);

		}

	}

	public static boolean isEven(int number) {
		if (number % 2 == 0)
			return true;
		else
			return false;

	}
}
