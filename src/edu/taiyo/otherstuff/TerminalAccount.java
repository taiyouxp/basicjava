package edu.taiyo.otherstuff;

import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        //creatin obj scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Type your number(ex: 1021) ");
            int number = scanner.nextInt();
             //consuming the newline left by nextInt()
             scanner.nextLine();

            System.out.println("Type the number of the agency(ex: 067-8) ");
            String agency = scanner.nextLine();
            
            System.out.println("Type your name(ex: NEYMAR JR) ");
            String name = scanner.nextLine();

            System.out.println("Type your balance(ex: 113.22) ");
            double balance = scanner.nextDouble();

            //print data informed by user
            String message = String.format("Hello %s, thank you for creating your account in our bank \n your agency is %s, account %s and your balance %.2f is already available for withdraw.",
            name, agency, number, balance
        );

        //exhibiting the message
        System.out.println(message);

        //closing the scanner
        scanner.close();
        }
    }

}
