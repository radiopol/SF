package model_20_2.task1;

import java.util.Scanner;

public class Human {
    double mass, height, imt;

    public Human() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Масса тела: ");
        mass = scan.nextDouble();
        System.out.println("Рост: ");
        height = scan.nextDouble();
        imt = mass / Math.pow(height / 100, 2);
    }

    public String decisionIMT () {
        String result="";
        if(imt <= 16)
            result = "Выраженный дефицит массы тела";
        else if(imt > 16 && imt <= 18.5)
            result = "Недостаточная масса тела (дефицит)";
        else if(imt > 18.5 && imt <= 25)
            result = "Норма";
        else if(imt > 25 && imt <= 30)
            result = "Избыточная масса тела (состояние, предшествующее ожирению)";
        else if(imt > 30 && imt <= 35)
            result = "Ожирение 1-й степени";
        else if(imt > 35 && imt <= 40)
            result = "Ожирение 2-й степени";
        else if(imt > 40)
            result = "Ожирение 3-й степени";
        return result;
    }
}
