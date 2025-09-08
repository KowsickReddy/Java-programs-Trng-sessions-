import java.util.Scanner;
public class CarRentalCost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int R1=sc.nextInt();
        int R2=sc.nextInt();
        int minutes=sc.nextInt();
        int totalHours=(minutes+59)/60;
        int cost;
        if(totalHours<=N){
            cost=totalHours*R1;
        }else{
            cost=(N*R1)+((totalHours-N)*R2);
        }
        System.out.println(cost);
    }
}
