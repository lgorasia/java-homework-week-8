package homework;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] arg) {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0); // charAt(0) will return character at specified index position

        // condition to check vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Entered character " + ch + " is  Vowel");
        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))    // condition to check consonant
            System.out.println("Entered character " + ch + " is Consonant");
        else
            System.out.println("Not an alphabet");

    }
}

