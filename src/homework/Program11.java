package homework;

public class Program11 {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        int compare = 0;
        while (number > 0) {
            compare = number % 10;
            if (compare % 2 == 0) {
                sum += compare;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

}
