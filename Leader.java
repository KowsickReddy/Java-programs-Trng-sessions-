import java.util.Scanner;
public class Leader {
    public static void main(String[] args) {
        int a[]=new int[6];
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 6 elements:");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
        }
        for(int j=1;j<6;j++){
            if(a[j-1]<a[j]){
                count++;
            }
        }
        System.out.println("The leadears in the array was: "+count);
    }

}
