package model_20_2.task11;

public class Solution {

    public static void main(String[] args) {
        int value = add(7, 8);
        int result = add(value, 15);
        System.out.println(result);
    }

    private static int add( int x, int y) {
        int result = (x + y);
        return result;
    }
}