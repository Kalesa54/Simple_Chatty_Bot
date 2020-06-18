import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        String string2 = null;
        if (number1 >= 0 && number1 < string1.length() && number2 >= 0 && number2 < string1.length()) {
            string2  = string1.substring(number1, number2 + 1);
        }
        System.out.println(string2);
    }
}
