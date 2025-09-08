import java.util.Scanner;
public class EvenSum {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num,temp,sum=0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        while(num > 0){
          temp=num%10;
          if(temp%2==0){
            sum=sum+temp;
          }
          num=num/10;
        }
        System.out.println("The sum of the even number in the given number was as follows:"+sum);

    }

}
