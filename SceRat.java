import java.util.Scanner;
public class SceRat {
    @SuppressWarnings("resource")
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       int a[]=new int[8];
       System.out.println("r:");
       int ra=sc.nextInt();
       System.out.println("Units:");
       int uni=sc.nextInt();
       System.out.println("arr:");
       for(int i=0;i<8;i++){
        a[i]=sc.nextInt();
       }
       NewSceRat sr=new NewSceRat();
       int res=sr.rat(ra,uni,a);
       System.out.println(" "+res);
    }
}
class NewSceRat{
    public int rat(int r,int unit,int [] arr){
        int sum=0,cnt=0;
        boolean found=false;
        if(arr==null){
            return -1;
        }
        int mul=r*unit;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            cnt++;
            if(sum>=mul){
                found=true;
                break;
            }
        }
        if(!found){
            return 0;
        }
        return cnt;
    }
}