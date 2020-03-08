package problem.solving;

/**
 * 
 * @author gowtham pr
 *
 *         Given a number print and count the numbers which are divisible by it.
 */
public class NumbersDivisibleByK {

	public static void main(String[] args) {

		int k = 8;

		int sum = 0;
		int counter = 0;
		for (int i = 1; i <= 984; i++) {
			sum = sum + i;
			if ((i % k) == 0) {
				System.out.println(i);
				counter++;
			}
		}

		System.out.println("---Numbers Count-->>" + counter);
		// System.out.println("---Logic-->>" + 984/3);

		/*
		 * int n = 10; n = n * (n + 1) / 2; System.out.println("===" + n);
		 */

	}

}
