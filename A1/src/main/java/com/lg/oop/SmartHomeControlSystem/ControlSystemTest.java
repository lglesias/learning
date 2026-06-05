package src.main.java.com.lg.oop.SmartHomeControlSystem;

import java.util.Scanner;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.SmartHomeControlSystem
 * @since 2026-06-05  16:52
 */
public class ControlSystemTest {
    public static void main(String[] args) {
        SmartHome[] smartHomes = new SmartHome[4];
        smartHomes[0] = new Lamp("lamp", false);
        smartHomes[1] = new WashingMachine("washing machine", false);
        smartHomes[2] = new Television("television", false);
        smartHomes[3] = new Window("window", false);

        //For each device, customize an on/off function
        SmartHomeControl smartHomeControl = SmartHomeControl.getInstance();
        //smartHomeControl.control(smartHomes[0]);

        //Prompt the user to operate

        //print all machines on/off
        while (true) {
            smartHomeControl.printAllMachines(smartHomes);
            System.out.println("Please select the machine you want to control: ");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt() - 1;
            switch (command) {
                case 0:
                    smartHomeControl.control(smartHomes[0]);
                    break;
                case 1:
                    smartHomeControl.control(smartHomes[1]);
                    break;
                case 2:
                    smartHomeControl.control(smartHomes[2]);
                    break;
                case 3:
                    smartHomeControl.control(smartHomes[3]);
                    break;
                case 4:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid input");
            }
        }
    }
}
