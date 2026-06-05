package src.main.java.com.lg.oop.SmartHomeControlSystem;

/**
 * TODO：功能描述
 *
 * @author lglesias
 * @version 1.0
 * @BelongsProject javseProjectAi
 * @BelongsPackage src.main.java.com.lg.oop.SmartHomeControlSystem
 * @since 2026-06-05  17:13
 */
public class SmartHomeControl {
    /**
     * Singleton Pattern
     */
    private static final SmartHomeControl smartHomeControl = new SmartHomeControl();
    private SmartHomeControl(){}

    public static SmartHomeControl getInstance() {
        return smartHomeControl;
    }

    public void control(SmartHome smartHome) {
        System.out.println(smartHome.getName()
                + " " + "state is now "
                + (smartHome.isStatus() ? "on" : "off"));
        System.out.println("Start operation...");
        smartHome.Press();
        System.out.println(smartHome.getName()
                + " " + "state is now "
                + (smartHome.isStatus() ? "on" : "off"));
        System.out.println("--------------------------------------------------");
    }

    public void printAllMachines(SmartHome[] smartHomes) {
        for (int i = 0; i < smartHomes.length; i++) {
            SmartHome smartHome = smartHomes[i];
            System.out.println("Machine "
                    + (i + 1)
                    + ": "
                    + smartHome.getName()
                    + " "
                    + "state is now "
                    + (smartHome.isStatus() ? "on" : "off"));
        }
        System.out.println("--------------------------------------------------");
    }
}
