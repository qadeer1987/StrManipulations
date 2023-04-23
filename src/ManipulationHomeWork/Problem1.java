package ManipulationHomeWork;

import java.util.Scanner;

// Create a String and if the String is not empty perform the following:
//if the String has an odd number of characters and has 3 or more characters,
// print the character in the middle of the String.
//For Example String str=hello =>l
public class Problem1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = input.nextLine();

        if (word.length() % 2 == 1 && word.length() >= 3) {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println("The middle character is: " + middleChar);
        } else {
            System.out.println("The word is either empty, has an even number of characters, or has less than 3 characters.");
        }

        input.close();
    }
}

