package module_23.task1;

public class Solution {
    public static final String NUMBER = "12345678";
    public static final String COMMA = ",";

    public static void main(String[] args) {
        System.out.println(NUMBER.replaceAll("(?<=\\d)(?=(\\d{3})+$)",COMMA));
    }
}
