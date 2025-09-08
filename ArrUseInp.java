import java.util.Scanner;
public class ArrUseInp {
    public static void main(String[] args){
        int a[]=new int[5];
        System.out.println("Enter the any 5 elements");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The enterd values in the array was:");
        for(int j=0;j<5;j++){
            System.out.print(" "+a[j]);
        }
    }

}
