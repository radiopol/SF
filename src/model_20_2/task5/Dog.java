package model_20_2.task5;

public class Dog {
    String name;
    int health, power;
    boolean isLive;

    public Dog(String name, int health, int power){
        this.name = name;
        this.health = health;
        this.power = power;
        isLive = health > 0;
    }

}
