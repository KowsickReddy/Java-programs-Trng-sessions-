import java.util.Scanner;

public class Count {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num,count=0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==0){
            count=1;
        }
        if(num<0){
            num=-num;
        }
        while(num>0){
            count=count+1;
            num=num/10;
        }
        System.out.println("The size of the number was:"+count);

    }

}
