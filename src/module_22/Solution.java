package module_22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        String text = "У Сени, Вани и Алексея в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс][а-яА-Я]*?\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
