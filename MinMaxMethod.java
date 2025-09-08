import java.util.Scanner;
public class MinMaxMethod {
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
        int n,temp1=0,temp2=Integer.MAX_VALUE;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n]; 
        System.out.println("Enter the " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        MinMaxMethod obj=new MinMaxMethod();
        for(int i=0;i<n;i++){
         temp1= obj.max(a[i]);
         temp2=obj.min(a[i], temp2);
        }
        System.out.println("Max element in the array was:"+temp1);
        System.out.println("Min element in the array was:"+temp2);
    }
    
    public int max(int a){
        int temp1=0;
        if(temp1<a){
            temp1=a;
        }
        return temp1;
    }
    
    public int min(int a, int temp2){
        if(temp2 > a){
            temp2 = a;
        }
        return temp2;
    }
}