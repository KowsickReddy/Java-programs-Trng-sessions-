import java.util.Scanner;

public class PassFail {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        int sub1, sub2, sub3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks for all 3 subjects:");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();

        if (sub1 >= 35 && sub2 >= 35 && sub3 >= 35) {
            System.out.println("The student has passed successfully!");
        } else {
            System.out.println("The student has failed.");
        }

        sc.close(); 
    }
}
