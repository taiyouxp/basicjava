package edu.taiyo.otherstuff;

import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        //creatin obj scanner
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Type ur name: ");
            String name = scanner.next();

            System.out.println("Type ur surname: ");
            String surname = scanner.next();
            
            System.out.println("Type ur age: ");
            int age= scanner.nextInt();

            System.out.println("Type ur height: ");
            double height = scanner.nextDouble();

            //print data informed by user

            System.out.println("my name is "+name+" "+surname);
            System.out.println("im "+age+" years old");
            System.out.println("my height is "+height+" cm");
        }
    }
}
