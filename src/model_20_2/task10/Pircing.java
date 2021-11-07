package model_20_2.task10;

import java.util.Scanner;

public class Pircing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Возраст: ");
        int age = scan.nextInt();

        printRestrictions(age);
    }

    public static void printRestrictions(int age) {
        if (age < 14) {
            System.out.println("прокол ушей в присутствии родителей");
        }
        else if (age < 18) {
            System.out.println("прокол ушей, пупка, языка, носа в присутствии родителей");
        }
        else {
            System.out.println("без ограничений");
        }
    }
}
