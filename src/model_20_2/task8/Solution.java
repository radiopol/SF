package model_20_2.task8;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        boolean isAlwaysLarger = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите нижнее значение отрезка: ");
        double lowBound = scan.nextDouble();
        System.out.print("Введите верхнее значение отрезка: ");
        double topBound = scan.nextDouble();
        System.out.print("Введите шаг дискретизации: ");
        double delta = scan.nextDouble();
        for (double i = lowBound; i <= topBound; i = i + delta) {
            double sinOfCos = Math.sin(Math.cos(i));
            double cosOfSin = Math.cos(Math.sin(i));
            if (sinOfCos > cosOfSin) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + sinOfCos + ", cos(sin(x)) = " + cosOfSin +
                        ": sin(cos(x)) больше чем cos(sin(x))");
            }
            else if (cosOfSin > sinOfCos) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + sinOfCos + ", cos(sin(x)) = " + cosOfSin +
                        ": cos(sin(x)) больше чем sin(cos(x))");
            }
            else {
                System.out.println("При x = " + i + " sin(cos(x)) = " + sinOfCos + ", cos(sin(x)) = " + cosOfSin +
                        ": sin(cos(x)) равен cos(sin(x))");
            }
        }
    }
}
