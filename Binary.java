import java.util.Arrays;
import java.util.Scanner;
public class Binary {
    public static void main(String[] args) {
        int a[]=new int[5];
        int targ;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 elements");
        for(int i=0;i<5;i++){
           a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Enter the target value:");
        targ=sc.nextInt();
        int st=0;
        int max=a.length-1;
        boolean found=false;
        System.out.println("After sorting the array was:");
        for(int i=0;i<5;i++){
            System.out.println(" "+a[i]);
        }
         while(st<=max){
             int mid=st+max/2;
            if(a[mid]==targ){
                System.out.println("The element was found:"+mid);
                  found=true;
                  break;
            }
            else if(a[mid]<targ){
               st=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        if(!found){
            System.out.println("The element was not found:");
        }
    }

}
