import java.util.Scanner;
public class Sumnoloop {
    public static void main(String[] args) {
        int num,a,b,temp;
        System.out.println("Enter the 2 digit number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        a=num%10;
        b=num/10;
        temp=a+b;
        System.out.println("The sum of the numbers was:"+temp);

    }

}
