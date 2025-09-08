import java.util.Scanner;
public class Palindrome {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num,rev=0,temp,f;
        System.out.println("Enter the number that you want");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        f=num;
        while(num > 0){
            temp=num%10;
            rev=rev*10+ temp;
            num=num/10;

        }
        if(f == rev)
        {
            System.out.println("The given number was palindrone");
        }
        else{
            System.out.println("The given number was not a palindrone");
        }
    }

}
