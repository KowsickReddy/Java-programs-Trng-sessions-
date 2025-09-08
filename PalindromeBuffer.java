import java.util.Scanner;
public class PalindromeBuffer {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int p=0;
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        for(int i=0;i<sb.length();i++){
            for(int j=sb.length()-1-i;j>=0;j--){
                if(sb.charAt(i)==sb.charAt(j)){
                     p+=1;
                }
                break;
            }
        }
        if(p==sb.length()){
            System.out.println("This is a palindrome");
        }
        else{
            System.out.println("This is not a palindrome");
        }

    }

}
