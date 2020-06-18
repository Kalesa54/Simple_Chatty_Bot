import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //Minimum sleeping hours
        int b = scanner.nextInt(); // Maximum sleeping hours
        int h = scanner.nextInt(); // actual sleeping hours

        if (a <= h && h <= b) {
            System.out.println("Normal");
        } else if (h  > b) {
            System.out.println("Excess");
        } else if (h < a && h < b) {
            System.out.println("Deficiency");
        }
    }
}