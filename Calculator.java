import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int a,b,val=0;
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers you want to perform the action:");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter the mathematical symbol that you want to perform operation");
        c=sc.next().charAt(0);
        if(c=='+'){
            val=a+b;
        }
        else if(c=='-'){
            val=a-b;
        }
        else if(c=='*'){
            val=a*b;
        }
        else if(c=='/'){
            val=a/b;
        }
        System.out.println("The output was:"+val);
    }

}
