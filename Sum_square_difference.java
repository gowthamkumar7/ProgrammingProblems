public class Main

{
    
    /**
     * Brute Force approach
    */
	public static void main(String[] args) {
		int n=100;
		int sumOfN=n*(n+1)/2;
		int sqaureOfsumOfN=sumOfN*sumOfN;
		int sum=0;
		for (int x=1;x<=100 ;x++ ){
		    int square=x*x;
		    sum=sum+square;
		} 
		
		System.out.println(sqaureOfsumOfN-sum); // Difference b/w sum of the squares of the first one hundred natural numbers and the square of the sum
		
		
		
		
	}
}
