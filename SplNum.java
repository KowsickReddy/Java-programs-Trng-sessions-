import java.util.Scanner;

public class SplNum {
    public static void main(String[] args) {
        int num, temp, t1, f, act = 0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        t1=num;
        while(num!=0) {
            temp=num%10;
            num=num/10;
            f=1;  
            for(int i=temp; i>0; i--) {
                f=f*i;
            }
            act=act+f;
        }
        if (act==t1) {
            System.out.println("The number was a special number");
        } else {
            System.out.println("The number was not a special number");
        }
    }
}
