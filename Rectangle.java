import java.util.Scanner;
public class Rectangle {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        int l,b,area,peri;
        System.out.println("Enter the length and breadth  of the rectanglr:");
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        area=l*b;
        peri=2*(l+b);
        System.out.println("The area of the rectangle was the:"+area);
        System.out.println("The perimeter of the rectangle was the:"+peri);
    }

}
