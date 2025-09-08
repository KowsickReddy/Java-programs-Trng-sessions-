import java.util.Scanner;
public class RevArr {
    public static void main(String[] args) {
        int a[]=new int[5];
        int b[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 elements in the array:");
        for(int i=0;i<5;i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("The elements in the array are:");
        for(int i=0;i<5;i++) {
            System.out.println(" " +a[i]);
            b[i]=a[4-i];
        }
        System.out.println("The reverse of the array is:");
        for(int i=0;i<5;i++) {
            System.out.println(" " + b[i]);
        }
        sc.close();
    }
}
