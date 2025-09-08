import java.util.Scanner;
public class Linear {
    public static void main(String[] args) {
        int a[]=new int[5];
        int tar;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 elements:");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        tar=sc.nextInt();
        for(int i=0;i<5;i++){
            if(a[i]==tar){
                System.out.println("The target was found at the location :"+i);
                break;
            }
        }
    }

}
