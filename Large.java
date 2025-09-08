import java.util.Scanner;
public class Large {
    public static void main(String[] args) {
        int a[]=new int[5];
        int great=0;
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements:");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(great<a[i]){
                great=a[i];
            }
        }
        System.out.println("The largest element in the array was: "+great);
    }

}
