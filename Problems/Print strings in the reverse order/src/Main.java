//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.next();
        String secondInput = scanner.next();
        String thirdInput = scanner.next();

        String firstOutput = thirdInput;
        String secondOutput = secondInput;
        String thirdOutput = firstInput;

        System.out.println(firstOutput);
        System.out.println(secondOutput);
        System.out.println(thirdOutput);
    }
}