package modul_20_1;

public class Loader {
    public static void main(String[] args) {
        String color = "Красный";
        Loader car = new Loader();
        System.out.println(car.moveDesision(color));
    }

    public String moveDesision(String color){
        String result;
        switch (color){
            case "Красный":
                result = "остановиться";
                break;
            case "Зеленый":
                result = "ехать";
                break;
            case "Желтый":
                result = "подождать";
                break;
            default:
                result = "у светофора нет такого цвета!";
        }
        return result;
    }
}