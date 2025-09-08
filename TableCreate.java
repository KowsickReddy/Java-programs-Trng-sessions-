import java.util.Scanner;
public class TableCreate {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        int num,i;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Enter the table number you want:");
        for(i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }

    }

}
