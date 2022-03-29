package homework;

import java.util.Scanner;

public class Program10 {

    public static void main(String[] arg) {

        int a, arm = 0, n, temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check Armstrng number or not: ");
        n = scanner.nextInt();
        temp = n;

        for (; n != 0; n /= 10) {
            a = n % 10;
            arm = arm + (a * a * a);
        }
        if (arm == temp)
            System.out.println(temp + " is a Armstrong number.");
        else
            System.out.println(temp + " is not a Armstrong number.");

    }

}

