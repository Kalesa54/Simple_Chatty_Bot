//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next(); // Jane
        String secondName = scanner.next(); //Kate
        String thirdName = scanner.next(); //John
        String fourthName = scanner.next(); // Mary
        String fifthName = scanner.next(); // Susan
        String sixthName = scanner.next(); // Paul
        String seventhName = scanner.next(); //Boris
        String eigthName = scanner.next(); // Ann

        System.out.println(eigthName); // Ann
        System.out.println(seventhName); // Boris
        System.out.println(sixthName); //Paul
        System.out.println(fifthName); // Susan
        System.out.println(fourthName); // Mary
        System.out.println(thirdName); //John
        System.out.println(secondName); // Kate
        System.out.println(firstName); // Jane
    }
}