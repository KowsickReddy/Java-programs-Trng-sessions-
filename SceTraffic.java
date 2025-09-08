import java.util.Scanner;

public class SceTraffic {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length:");
        int n=sc.nextInt();
        int even=0,odd=0;
        int a[]=new int[n];
        System.out.println("Enter the "+n+" Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Enter the date:");
        int dt=sc.nextInt();
        System.out.println("Enter the fines to be colleceted");
        int fne=sc.nextInt();
        if(dt%2==0){
            System.out.println("fnes collected:"+odd*fne);
        }
        else{
            System.out.println("Fines to be collected:"+even*fne);
        }
    }
}
