import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int desks1 = 0;
        int desks2 = 0;
        int desks3 = 0;
        
        if(number1%2 != 0){
            number1++;
             desks1 = number1/2;
        } else{
            desks1 = number1/2;
        }
        if (number2%2 != 0){
            number2++;
            desks2 = number2/2;
        }else{
            desks2 = number2/2;
        }
        if (number3%2 !=0){
            number3++;
            desks3 = number3/2;
        }else{
            desks3 = number3/2;
        }
        int numberOfAllDesks = desks1 + desks2 + desks3;
        System.out.println(numberOfAllDesks);
    }
}