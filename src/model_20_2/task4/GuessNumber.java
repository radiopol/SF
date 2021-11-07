package model_20_2.task4;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Random rand = new Random();
        int randInt = rand.nextInt(10) + 1;
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.print("Введите число: ");
            int number = scan.nextInt();
            if(randInt > number) {
                System.out.println("Загаданное мною число больше");
            }
            else if(randInt < number) {
                System.out.println("Загаданное мною число меньше");
            }
            else if(randInt == number) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                break;
            }
        }
    }
}
