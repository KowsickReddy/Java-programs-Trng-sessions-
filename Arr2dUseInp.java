import java.util.Scanner;
public class Arr2dUseInp {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 9 elements:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The enterd elements are");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }

}
