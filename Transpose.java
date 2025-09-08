import java.util.Scanner;
public class Transpose {
    public static void main(String[] args) {
        int a[][]=new int[3][4];
        int b[][]=new int[4][3];
        System.out.println("Enter the 12 elements");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                a[i][j]=sc.nextInt();
                b[j][i]=a[i][j];
            }
        }
        System.out.println("After transpose of the matrix the elements are:");
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+b[i][j]);
            }
            System.out.println();
        }

    }

}
