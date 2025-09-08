import java.util.Scanner;

public class MulArr {
    public static void main(String[] args){
        int a[]=new int[5];
        int mul=1;
        System.out.println("Enter the 5 elements:");
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The elements in the array was:");
        for(int j=0;j<5;j++){
            mul*=a[j];
            System.out.println(" "+a[j]);
         
        }
        System.out.println("The sum of the contents in the array was:"+mul);
    }

}
