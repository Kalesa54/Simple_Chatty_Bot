import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int days;
        int h = scanner.nextInt(); // height 10
        int a = scanner.nextInt(); //up 3
        int b = scanner.nextInt(); //down 2
        int daysNeeded = 0;


        while (h != 0 && h > b && a > b) {

            days = h - a; // 10-3=7
            h = days + b; // 7+2 = 9
            daysNeeded++;


        }
        System.out.println(daysNeeded);
    }
}