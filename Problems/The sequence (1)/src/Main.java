import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumOfNumbers = 0;

        for (int i = 1; i <= n && sumOfNumbers != n; i++) {
            for (int j = 0; j < i; j++) {
                if (sumOfNumbers == n) {
                    break;
                }
                System.out.print(i + " ");
                sumOfNumbers += 1;

            }
        }
    }
}