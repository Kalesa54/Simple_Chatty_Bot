import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String reversed = new StringBuilder(input).reverse().toString();
        long randomNumber = (long) Math.random();

        if (input.compareTo(reversed) == 0) {
            System.out.println(1);
        } else {
            System.out.println(randomNumber);
        }
    }
}