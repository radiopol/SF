package model_20_2.task12;

public class Loader {

    public static void main(String[] args) {
        int a = 10;
        int summ = 0;

        while (a > 0) {
            if (a == 5) {
                break;
            }
            a--;
        }

        for (int i = 0; i < 50; i++) {
            if (i == 45) {
                continue;
            }
            summ += i;
        }

        switch (summ) {
            case 50 -> System.out.println(50);
            case 1180 -> System.out.println(1180);
            case 1225 -> System.out.println(1225);
            default -> System.out.println("Результат неверный");
        }

        if (a == 5 && summ == 1180) {
            System.out.println("Условие выполнено");
        } else {
            System.out.println("Условие не выполнено");
        }
    }
}
