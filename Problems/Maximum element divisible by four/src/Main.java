import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of elements in the sequence
        int g = 0;
        int maximumNumber = 0;

        for (int i = 1; i <= n; i++) {

            g = scanner.nextInt();

            if (g % 4 == 0 && g > maximumNumber) {  // g durch 4 teilbar

                    maximumNumber = g; // maximumNumber wird zu g

            }
        }
        System.out.println(maximumNumber);
    }
}
