package problem.solving;


/**
 * 
 * @author gowtham pr
 * Find leaders
 *	https://javaconceptoftheday.com/how-to-find-all-the-leaders-in-an-integer-array/
 */
public class FindLeaders {

	public static void main(String[] args) {

		// int array[] = { 14, 12, 70, 15, 99, 65, 21, 90 };
		// int array[] = { 12, 9, 7, 14, 8, 6, 3 };
		int array[] = { 55, 67, 71, 57, 51, 63, 38 };
		int leader = 0;

		for (int i = 0; i < array.length; i++) {

			leader = array[i];
			boolean isLeader = false;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > leader) {
					isLeader = false;
					break;
				} else {
					isLeader = true;
				}

			}
			if (isLeader)
				System.out.println(leader);
		}
		System.out.println(array[array.length - 1]);
	}
}
