package task4;

import java.util.Scanner;

public class WorkHours {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = (int) (Math.random() * 28801);


        System.out.println("Осталось " + n + " секунд");


        int hours = n / 3600;


        if (hours > 1) {
            System.out.println("Осталось " + hours + " часов");
        } else if (hours == 1) {
            System.out.println("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }

}


