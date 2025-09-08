import java.util.Scanner;
public class MissVal {
    public static void main(String[] args) {
        int a[]=new int[6];
        int sum=0,nn,miss=0;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        nn=(6*(6+1))/2;
        if(nn==sum){
           System.out.println("There is no missing vlues in the array:");
        }
        else{
            miss=nn-sum;
            System.out.println("The missing value was:"+miss);
        }
    }
}
