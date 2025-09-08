import java.util.Scanner;
public class TargetSum {
    public static void main(String[] args) {
        int a[]=new int[6];
        int tar;
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 6 elements:");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        tar=sc.nextInt();
        for(int i=0;i<6;i++){
            if(found==true){
                break;
            }
            for(int j=i+1;j<6;j++){
                if(a[i]+a[j]==tar){
                    System.out.println("The target was found at: "+i+"+"+j);
                    found=true;
                    break;
                }
            }
        }
    }

}
