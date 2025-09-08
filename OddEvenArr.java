import java.util.Scanner;
public class OddEvenArr {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int evn=0,odd=0;
        int a[]=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 6 numbers");
        for(int i=0;i<6;i++){
            a[i]=sc.nextInt();
            if(a[i]%2 ==0){
                evn++;
            }
            else{
                odd++;
            }
        }
        System.out.println("The elements in the array was:");
        for(int j=0;j<6;j++){
            System.out.println(" "+a[j]);
        }
        System.out.println("The even numbers in the array was:"+evn);
        System.out.println("The odd numbers in the array was:"+odd);
    }

}
