package problem.solving;


/**
 * 
 * @author gowtham pr
 * Find square root of the number
 */
public class Sqrt {

	public static void main(String[] args) {

		int number = 8649;
		findSqrt(number);

	}

	private static void findSqrt(int number) {
		
		for (double i = 1; i <= number / 2; i++) {
			
			if ((i * i) == number) {

				System.out.println(i);
				break;
			}

		}

	}
}
