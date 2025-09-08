import java.util.Scanner;
import java.util.Arrays;
public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the string:");
        int n = sc.nextInt();
        String[] a = new String[n];
        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        System.out.println("Enter the key of the array:");
        String key = sc.next();
        int len=a.length;
        Arrays.sort(a);
        int min=0;
        int max=len-1;
        boolean status=false;
        while(min<=max){
            int mid=(min+max)/2;
            if(a[mid]==key){
                System.out.println("The element was found at the position of:"+mid);
                status=true;
                break;
            }
            else if(a[mid]<key){
                min=mid+1;
            }
            else{
                max=mid-1;
            }
            
        }
        if(!status){
            System.out.println("The element was not found in thre array:");
        }
    }
}
