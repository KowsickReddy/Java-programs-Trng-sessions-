import java.util.Scanner;

class Rotate_1 {
    public void rotate(int[] arr) {
        int temp = arr[arr.length - 1];  // Save last element for right rotation
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];  // Shift elements to the right
        }
        arr[0] = temp;  // Place last element at the front

        System.out.println("The rotated array was:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Changed println to print for better output
        }
        System.out.println(); // Newline after each rotation
    }
}

public class LeeftArray {
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

        Rotate_1 obj = new Rotate_1();

        System.out.println("Enter the number of rotations");
        int r = sc.nextInt();

        while (r != 0) {
            obj.rotate(a);
            r--;
        }
    }
}
