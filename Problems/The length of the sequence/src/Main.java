import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number;
        int counter = -1;

        do {
            number = scanner.nextInt();
            counter++;
        } while (number != 0);
        System.out.println(counter);
    }
}