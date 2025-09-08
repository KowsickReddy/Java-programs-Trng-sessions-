import java.util.Scanner;
public class MagicNum {
    public static int sumDigit(int num) {
        int temp, val = 0;
        while (num!=0) {
            temp=num % 10;
            num=num/10;
            val+=temp;
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int val = sumDigit(num);
            while(val>=10){
                val=sumDigit(val);
            }
            if(val==1){
                System.out.println("The given number was a magic number:");
            }
            else{
                System.out.println("The number was not a magic number:");
            }
        sc.close();
    }
}
