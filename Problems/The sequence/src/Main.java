import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int input;
        int maxNumber = 0;

        while (scanner.hasNext()) {
            input = scanner.nextInt();

            if (input % 4 == 0 && maxNumber < input) {

                maxNumber = input;

            }
        }
        System.out.println(maxNumber);
    }
}