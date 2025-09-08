import java.util.Scanner;
public class LeapYear {
    @SuppressWarnings("resource")
    public static void main(String[] args){
    int year;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the  year");
    year=sc.nextInt();
    if((year%4==0 && year%100 != 0)|| (year%400==0)){
        System.out.println("The given year was leap year");
    }
    else{
        System.out.println("The given year was not a leap year");
    }
}

}
