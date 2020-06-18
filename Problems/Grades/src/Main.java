import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // number of students
        int a = 0; // 5
        int b = 0; // 4
        int c = 0; // 3
        int d = 0; // 2

        for (int i = 1; i <= n; i++) {

            int g = scanner.nextInt(); // Studentgrade
            if (g == 2) {
                d++;
            } else if (g == 3) {
                c++;
            } else if (g == 4) {
                b++;
            } else if (g == 5) {
                a++;
            }
        }
        System.out.print(d + " ");
        System.out.print(c + " ");
        System.out.print(b + " ");
        System.out.print(a);

    }
}
