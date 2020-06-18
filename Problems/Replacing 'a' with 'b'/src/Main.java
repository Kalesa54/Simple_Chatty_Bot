import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = string1.replace("a", "b"); 
        System.out.println(string2);

    }
}
