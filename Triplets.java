package problem;

/**
 * 
 * @author gowtham.paidi
 * 
 *         Find the triplet for the given number
 */
public class Triplets {

	// TODO: Not the Optimal solution
	// This code gives --> O(n3)
	public static void main(String[] args) {

		int array[] = { 2, 7, 0, 4, 9, 5, 1, 3 };

		int sum = 9;
		for (int i = 0; i < array.length - 1; i++) {

			for (int j = i + 1; j < array.length - 1; j++) {

				for (int j2 = j + 1; j2 < array.length - 1; j2++) {

					if (array[i] + array[j] + array[j2] == sum) {

						System.out.println("" + i + "," + j + "," + j2);

						System.out.println(array[i] + "-->" + array[j] + "--->" + array[j2]);
					}

				}
			}
		}

	}
}
