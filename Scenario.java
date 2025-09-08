import java.util.Scanner;
public class Scenario {
    public static void main(String[] args) {
        int num,temp,sum=0;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        while(num!=0){
            temp=num%10;
            num=num/10;
            sum+=temp;
            
        }
        if(sum%2==0 && sum>0){
            System.out.println("This is a valid number");

        }
        else{
            System.out.println("This not a valid number");
        }

    }

}
