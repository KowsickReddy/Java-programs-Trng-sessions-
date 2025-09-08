import java.util.Scanner;

public class MultiAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, index = 0;

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Create a new array to store rearranged elements
        int result[] = new int[n];

        // First, place non-multiples of 10
        for (int i = 0; i < n; i++) {
            if (a[i] % 10 != 0) {
                result[index++] = a[i];
            }
        }

        // Then, place multiples of 10
        for (int i = 0; i < n; i++) {
            if (a[i] % 10 == 0) {
                result[index++] = a[i];
            }
        }

        // Display the result
        System.out.println("Array after moving multiples of 10 to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
