package homework;

public class Program7 {

    public static void main(String[] args) {

        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);
    }

    public static int sumFirstAndLastDigit(int number) {

        int lastDigit = 0;
        if(number >= 0){
            lastDigit = number % 10;

            while (number > 9){
                number = number / 10;
            }

            System.out.println("First Number " + number + " Last Number " + lastDigit + " Total = " + (number + lastDigit));
            return 0;
        } else

            System.out.println("-1 since parameter is negative and needs to be positive.");
        return -1;
    }


}
