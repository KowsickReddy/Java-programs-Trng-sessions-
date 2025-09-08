import java.util.Scanner;
public class SceMagicNUm {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in); 
        int v=sc.nextInt();
        int temp=0;
        int temp1=0;
        int count=0;
        int dig=0;
        int r=sc.nextInt();
        while(v!=0){
            temp=v%10;
            v=v/10;
            count+=temp;
        }
        count=count*r;
        if(count>9){
            while(count!=0){
                temp1=count%10;
                count=count/10;
                dig+=temp1;
            }
            System.out.println(dig);
        }
        else{
            System.out.println(count);
        }
    }
}
