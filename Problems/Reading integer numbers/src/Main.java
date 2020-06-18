import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numbers = 4;
        String number = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(number);

        while (numbers != 0) {
            numbers--;
            System.out.println(st.nextToken());
        }
    }
}
