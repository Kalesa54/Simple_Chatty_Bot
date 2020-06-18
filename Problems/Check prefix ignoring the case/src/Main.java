import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String string1 = input.toUpperCase();

        if (string1.charAt(0) == 'J') {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}