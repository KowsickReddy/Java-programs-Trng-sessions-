import java.util.Scanner;

public class Fibonacii {
    public static void main(String[] args) {
        int x = 0, y = 1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a = sc.nextInt();
            for (int i = 2; i <= a; i++) {
                c = x + y;
                x = y;
                y = c;
            }
        System.out.println("The " + a + "th Fibonacci number is: " + y);
        
    }
}
