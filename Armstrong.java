import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int num, t1, t2, count = 0, x, y;
        double z=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        t1 = num;
        t2 = num;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        while (t1 != 0) {
            y = t1 % 10;
            t1 = t1 / 10;
            z += Math.pow(y, count);
        }
        if ((int)z == t2) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        sc.close();
    }
}
