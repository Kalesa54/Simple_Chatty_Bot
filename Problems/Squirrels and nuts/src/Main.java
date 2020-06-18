import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n = scanner.nextInt(); // amount of squirrels
        int k = scanner.nextInt(); // amount of nuts
        int modulo = 0;

        if (n < 10_000 && k < 10_000) {

            modulo = k % n;

        }
        System.out.println(modulo);
    }
}
