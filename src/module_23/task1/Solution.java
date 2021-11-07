package module_23.task1;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число с клавиатуры: ");

        if (scanner.hasNext("^\\d+$")) {
            String number = scanner.nextLine();
            System.out.println(number.replaceAll("(?<=\\d)(?=(\\d{3})+$)",","));
        } else {
            System.out.println("Введите число!");
        }
    }
}
