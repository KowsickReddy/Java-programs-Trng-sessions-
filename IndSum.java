import java.util.Scanner;

public class IndSum {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int num,x, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        num = sc.nextInt(); 
        for (int i = 1; i <= 3; i++) {
            digit = num % 10;
            x = num / 10;
            sum = sum + digit;
            num=x;
        }
        System.out.println("The sum of the digits is: " + sum);
        sc.close();
    }
}
