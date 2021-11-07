package model_20_2.task18;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Введите x для вычисления формулы: ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        System.out.print("Введите N для вычисления формулы: ");
        int N = scan.nextInt();
        System.out.println(calculate(x, N));
    }

    public static double calculate(double x, int N) {
        double summ = 0;
        for (int i = 1; i <= N; i++) {
            summ += (Math.pow(x, 2) + 1) / i;
        }
        System.out.println("come on, man");
        return summ;
    }

}
