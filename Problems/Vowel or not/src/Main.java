import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {

        String st1 = String.valueOf(ch);

        String st = st1.toLowerCase();

        if (st.contains("a")) {
            return true;
        } else if (st.contains("e")) {
            return true;
        } else if (st.contains("i")) {
            return true;
        } else if (st.contains("o")) {
            return true;
        } else {
            return st.contains("u");
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}