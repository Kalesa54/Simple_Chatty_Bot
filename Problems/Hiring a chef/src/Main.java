//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        int age = scanner.nextInt();
        String stageOfEducation = scanner.next();
        int yearsOfExperience = scanner.nextInt();
        String cuisinePreference = scanner.next();

        System.out.println("The form for " + firstName + " is completed. " +
                "We will contact you if we need a chef that cooks " + cuisinePreference +" dishes.");
    }
}
