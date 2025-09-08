import java.util.Scanner;

public class All0Ends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,index=0;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int a[] = new int[n]; 
        System.out.println("Enter the " + n + " Elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]= a[index];
                a[index]=temp;
                index++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(" "+a[i]);
        }
    }

}
