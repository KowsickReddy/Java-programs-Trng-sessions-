
import java.util.Scanner;

public class Swap_2num {
    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the 2 numbers :");
            a = scan.nextInt();
            b = scan.nextInt();
        }
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a:"+" "+a+" "+"b:"+b);
    }

}
