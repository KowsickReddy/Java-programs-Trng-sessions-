import java.util.Scanner;

public class Age {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int age;
        System.out.println("Eneter the age of the person:");
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>=18){
            System.out.println("This person was eligible for voting!");
        }
        else{
            System.out.println("This person was not eligible for voting.");
        }
    }

}
