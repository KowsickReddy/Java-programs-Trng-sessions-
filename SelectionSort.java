
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ths Size of ");
        int n = sc.nextInt();
        System.out.println("Enter the " + n + "Elements");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int minind = i;
            for (int j = i + 1; j < n; j++) {
                if (a[minind] > a[j]) {
                    minind = j;
                }
            }
            int temp = a[i];
                a[i] = a[minind];
                a[minind] = temp;   
        }
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
    }

}
