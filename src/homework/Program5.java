package homework;

public class Program5 {

    public static boolean isPalindrome(int number) {
        int posNumber = Math.abs(number); // Math.abs() returns the absolute value of a int value

        String num1 = "";
        num1 += posNumber;
        String num2 = "";

        //to get the reverse of original number
        int reverse = 0;
        int lastDigit = 0;
        while (posNumber > 0) {
            lastDigit = posNumber % 10; // getting remainder
            posNumber /= 10;
            num2 += lastDigit;
        }

        //check if reverse number and origina number are equal
        if (num1.equals(num2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

}
