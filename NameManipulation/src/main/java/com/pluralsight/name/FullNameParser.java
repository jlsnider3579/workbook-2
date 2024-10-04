/**
 * Go back over this over the weekend to add comments for each step.
 * This will provide better structure and material understanding.
 */

package com.pluralsight.name;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine().trim();


        String[] nameParts = fullName.split("\\s+");

        String firstName = nameParts[0];
        String middleName = "(none)";
        String lastName = "";


        if (nameParts.length == 2) {

            lastName = nameParts[1];
        } else if (nameParts.length == 3) {

            middleName = nameParts[1];
            lastName = nameParts[2];
        } else {

            System.out.println("Invalid input. Please enter a name in 'first last' or 'first middle last' format.");
            return;
        }

        
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
