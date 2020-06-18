import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        float m = scanner.nextFloat(); // Money Ann puts in the bank
        float p = scanner.nextFloat(); // percent the bank increases Ann's Money
        float k = scanner.nextFloat(); // amount of money after k years
        int years = 0; // years Ann has to wait
        float amountOfMoneywithBankIncrease;

        if (k > m) {
            do {
                amountOfMoneywithBankIncrease = m + ((m * p) / 100);
                //System.out.println(amountOfMoneywithBankIncrease);
                years++;
                m = amountOfMoneywithBankIncrease;
            } while (amountOfMoneywithBankIncrease < k);
            System.out.println(years);
        } else if (k == m) {
            System.out.println(years);
        }

    }

}
