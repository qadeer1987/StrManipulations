package ManipulationHomeWork;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mom’s first name? ");
        String momName = input.next();

        System.out.print("Dad’s first name? ");
        String dadName = input.next();

        System.out.print("Boy or Girl? ");
        String gender = input.next();

        String suggestedName;
        if (gender.equalsIgnoreCase("boy")) {
            suggestedName = dadName.substring(0, 3).toUpperCase() + momName.substring(momName.length() - 2).toUpperCase();
        } else if (gender.equalsIgnoreCase("girl")) {
            suggestedName = momName.substring(0, 3).toUpperCase() + dadName.substring(dadName.length() - 2).toUpperCase();
        } else {
            System.out.println("Invalid input for gender. Please enter either 'boy' or 'girl'.");
            input.close();
            return;
        }

        System.out.println("Suggested baby name: " + suggestedName);
        input.close();
    }
}

