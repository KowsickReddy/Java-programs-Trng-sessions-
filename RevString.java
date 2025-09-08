import java.util.Scanner;
public class RevString {
    public static void main(String[] args) {
        String sb;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        sb=sc.nextLine();
        for(int i=sb.length()-1;i>=0;i--){
           System.out.print(sb.charAt(i));
        }
    }
}
