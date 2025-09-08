
import java.util.Scanner;

public class Swap_3var {
    public static void main(String[] args) {
        int a;
        int b;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the 2 numbers:");
            a = scan.nextInt();
            b = scan.nextInt();
        }
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the var numers are a:"+a+" "+"b:"+" "+b);
    }

}
