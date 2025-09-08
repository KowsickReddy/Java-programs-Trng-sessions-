import java.util.Scanner;
public class Reverse {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        int num,rev=0,temp;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num > 0){
            temp=num%10;
            rev=rev*10+temp;
            num=num/10;
        }
        System.out.println("The reversed number of the given number was:"+rev);
        sc.close();
    }


}
