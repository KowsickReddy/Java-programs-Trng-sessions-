import java.util.Scanner;
public class SceDiff {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("arr:");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("nums");
        int nu=sc.nextInt();
        System.out.println("diff:");
        int di=sc.nextInt();
        int len=a.length;
        NewSceDiff nn=new NewSceDiff();
        int res=nn.findCount(a,len,nu,di);
        System.out.println(" "+res);
    }

}
class NewSceDiff{
    public int findCount(int arr[],int length,int num,int diff){
        int sub;
        int c=0;
        for(int i=0;i<length;i++){
            sub=arr[i]-num;
            if(sub<0){
                sub=-sub;
            }
            if(sub<=diff){
                c++;
            }
        }
        return c;
    }
}
