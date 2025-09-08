import java.util.Scanner;

public class SceLeader {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int comp=0;
        int cnt=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>comp){
                comp=a[i];
                cnt++;
            }
        }
        System.out.println("the out put was:"+cnt);
    }

}
