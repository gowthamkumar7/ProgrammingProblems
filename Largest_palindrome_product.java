 public class Main {
        public static void main(String[] args) {

            int max = 0; // 
            for (int x = 100; x <= 999; x++) {
                for (int y = 100; y <= 999; y++) {
                    int multiplication = x * y; // Compute product 
                    if (isPolindrome(multiplication)) {
                        if (max < multiplication) //Find Largest number
                            max = multiplication;
                        System.out.println(max); //Largest palindrome product
                    }
                }
            }
        }

        /**
         *  Check given number is palindrome or not.
         * @param number Input
         * @return True if the number is palindrome
         */
        public static boolean isPolindrome(int number) {
            int reverse = 0;
            int original = number;
            while (number > 0) {
                int lastDigit = number % 10;
                reverse = (reverse * 10) + lastDigit;
                number = number / 10;
            }
            return (original == reverse);

        }

    }
