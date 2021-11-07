package model_20_2.task9;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Простые числа в промежутке от 2 до 100: ");
        for (int i = 2; i <= 100; i++) {
            boolean isExit = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    isExit = false;
                    break;
                }
            }
            if (isExit) {
                System.out.println(i);
            }
        }
    }
}
