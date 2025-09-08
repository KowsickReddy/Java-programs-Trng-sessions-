import java.util.Scanner;
public class StringModification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuffer result=new StringBuffer();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch)&&i!=0){
                result.append(' ');
            }
            result.append(Character.toLowerCase(ch));
        }
        System.out.println(result.toString()); 
    }
}
