package model_20_2.task13;

public class Solution {
    public static void main(String[] args) {
        int bucket1 = 30;
        int bucket2 = 0;
        int i = 0;

        while (bucket1 > 0) {
            if (bucket1 % 10 != 0) {
                bucket2++;
            }
            bucket1--;
            System.out.println(bucket1);
            System.out.println(bucket2);
        }
    }
}
