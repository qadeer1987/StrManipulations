package ManipulationHomeWork;

import java.util.Scanner;

public class Problem2 {

    // Create a String and print it in reverse order (Sunday → yadnuS).
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a word you want in reverse: ");
            String str = input.nextLine();

            String reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }


            System.out.println("The result: " + reverse);

            input.close();
        }
    }
