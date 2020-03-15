package problem.solving;

/**
 * 
 * @author gowtham pr Given an array find the sub-array sum is zero or not!
 */
public class SumZero {

	public static void main(String[] args) {

		int array[] = { 4, 2, -3, 1, 0, 4 };

		for (int i = 0; i < array.length; i++) {

			int sum = array[i];

			for (int j = i + 1; j < array.length; j++) {

				sum = array[j] + sum;
				if (sum == 0)
					System.out.println("Found");

			}
		}

	}
}
