package com.pluralsight.name;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name; ");
        String firstname = scanner.nextLine();

        System.out.print("Enter middle name; ");
        String middlename = scanner.nextLine();

        System.out.print("Enter last name; ");
        String lastName = scanner.nextLine();

        System.out.print("Enter suffix name; ");
        String suffix = scanner.nextLine();

        StringBuilder fullName = new StringBuilder();

        fullName.append(firstname);
        fullName.append(" ");
        fullName.append(middlename);
        fullName.append(" ");
        fullName.append(lastName);
        fullName.append(" ");
        fullName.append(suffix);
        fullName.append(" ");

        System.out.println(fullName);



    }
}
