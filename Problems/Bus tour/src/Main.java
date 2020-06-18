import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int heightOfBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();
        int heigtOfBridge = 0;
        for (int i = 1; i <= numberOfBridges; i++) {
            heigtOfBridge = scanner.nextInt();

            if (heightOfBus >= heigtOfBridge) {
                System.out.println("Will crash on bridge " + i);
                break;
            } else if (heigtOfBridge > heightOfBus) {
                continue;
            }
        }
        if (heigtOfBridge > heightOfBus) {
            System.out.println("Will not crash");
        }
    }
}