import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String forms = scanner.next();

        switch (forms) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();
                double s = 0.5 * (a + b + c);
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                double a1 = scanner.nextInt();
                double b1 = scanner.nextInt();
                System.out.println(a1 * b1);
                break;
            case "circle":
                double r = scanner.nextInt();
                double pole = 3.14 * r * r;
                System.out.print(pole);
                break;
            default:
                System.out.println("error!");
        }
    }
}