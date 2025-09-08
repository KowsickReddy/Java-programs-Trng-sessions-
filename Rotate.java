import java.util.Scanner;

class Rotate_1 {
    public void rotate(int[] arr, int rot) {
        for (int j = 0; j < rot; j++) {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
        }

        System.out.println("The rotated array was:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
    }
}

public class Rotate {
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

        obj.rotate(a, r);
    }
}
