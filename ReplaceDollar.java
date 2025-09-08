import java.util.Scanner;
public class ReplaceDollar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String s=sc.nextLine().toLowerCase();
        StringBuffer sb=new StringBuffer(s);
        String s1="aeiou";
        for(int i=0;i<sb.length();i++){
            for(int j=0;j<s1.length();j++){
                if(sb.charAt(i)==s1.charAt(j)){
                    sb.setCharAt(i,'$');
                }
            }
        }
        System.out.println("The modified string was:"+sb);
    }

}
