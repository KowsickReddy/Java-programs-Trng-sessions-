import java.util.Scanner;
class Rotate2method_1{
    public void rotate(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
           for(int j=arr.length-1;j<=0;j--){
            if(arr[i]!=arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
           }
        }
        System.out.println("The rotated array was:");
        for(int i=0;i<arr.length;i++){
            System.out.println(" "+arr[i]);
        }
    }
}

public class Rotate2method {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n]; 
        System.out.println("Enter the " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Rotate2method_1 obj=new Rotate2method_1();
        System.out.println("Enter the number of rotations");
        int r=sc.nextInt();
        while(r!=0){
        obj.rotate(a);
        r--;
        }
        
    }
}
