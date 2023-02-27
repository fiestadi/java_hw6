package task2;

import javax.swing.*;

public class Termometr {
    public static void main(String[] args) {
        int temperature1 = 101;
        int temperatur2 = 99;
        boolean isWorking = scanDevice(temperature1, temperatur2);
        System.out.println(isWorking);

    }

    private static boolean scanDevice(int temperature1, int temperatur2) {
        boolean isDeviceWorking = false;
        if (temperature1 > 100 && temperatur2 < 100) {

            isDeviceWorking = true;
        }
        return isDeviceWorking;

    }
}
