import java.util.Scanner;

/**
 * 
 * @author gowtham pr
 *         <p>
 *         This class takes an integer checks whether it is a prime number or
 *         not.
 * 
 */
public class FindPrimeNumber {
	public static void main(String[] args) {
		int flag = 0, input;
		Scanner reader = new Scanner(System.in); // Reading from System.in
		System.out.println("Enter a number: ");
		input = reader.nextInt(); // Scans the next token of the input as an int.
		// once finished
		reader.close();

		for (int i = 2; i < getRange(input); i++) {
			if (input % i == 0) {
				System.out.println("Not a prime number");
				flag = 1;
			}
		}
		if (flag != 1) {
			System.out.println("Is a prime number");
		}
	}

	/**
	 * 
	 * @param input
	 * @return double : how many times the condition has to be checked
	 */
	private static double getRange(int input) {

		// Best solution : Finds the square root and loops lesser times than the other
		// solution
		return Math.sqrt(input);

		// Better solution : Loops n/2 times effective
		return (input / 2);

		// Just solution : Loops n-1 times
		return input - 1;

	}
}
