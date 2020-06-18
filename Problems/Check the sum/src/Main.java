import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = a + b;
        int e = b + c;
        int f = a + c;

        if (d == 20 || e == 20 || f == 20) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}