package model_20_2.task5;

public class Solution {
    public static void main(String[] args) {
        Cat c = new Cat("Барсик",130,15);
        Dog d = new Dog("Шарик", 120,15);
        fight(c,d);
    }

    public static void fight(Cat cat, Dog dog){
        while(true) {
            cat.health -= dog.power;
            cat.isLive = cat.health > 0;
            dog.health -= cat.power;
            dog.isLive = dog.health > 0;
            if(!cat.isLive && !dog.isLive) {
                System.out.println("Сдохли оба");
                break;
            }
            else if(!cat.isLive) {
                System.out.println("псина победила");
                break;
            }
            else if(!dog.isLive) {
                System.out.println("киска победила");
                break;
            }
        }
    }
}
