import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();

        boolean stringCompare;
        String noWhiteSpace = string2.replaceAll(" ", "");
        String noWhiteSpace2 = string1.replaceAll(" ", "");
        String trim = noWhiteSpace.trim();
        String trim2 = noWhiteSpace2.trim();
        stringCompare = trim2.equals(trim);
        
        if (stringCompare) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
