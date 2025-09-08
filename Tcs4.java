import java.util.Scanner;

public class Tcs4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int cnt=0;
        int temp2=0;
        int res=1;
        for(int i=n1;i<=n2;i++){
            int temp=i;
            while(temp!=0){
                temp2=temp%10;
                res=res*10+temp2;
                temp=temp/10;
            }
            if(res!=i){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
