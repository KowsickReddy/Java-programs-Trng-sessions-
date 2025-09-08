import java.util.Scanner;

public class SceSubArr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,sum=0,x=0,h1=0;
        System.out.println("Enter the Hour:");
        n = sc.nextInt();
        int a[] = new int[n]; 
        int b[] = new int[n];
        System.out.println("Enter the entering  data:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the leaving data:");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           x+=a[i]-b[i];
           if(x>sum){
            sum=x;
            h1=i+1;
           }
        }
        System.out.println("The max number in the party was:"+sum);
        System.out.println("At the hour of:"+h1);
    }

}
