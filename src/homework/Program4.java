package homework;

public class Program4 {
    public static void main(String[] args) {

        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int num) {

        // condition to check number is less than 10
        if (num < 10) {
            return -1;
        }
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;

            //drop the least signigicant digit
            num /= 10;
        }
        return sum;
    }

}
