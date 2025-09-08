import java.util.Arrays;
import java.util.Scanner;
public class Anagram2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char[] ch1= s1.toCharArray();
        char[] ch2= s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String ss1=new String(ch1);
        String ss2=new String(ch2);
        if(ch1.length==ch2.length){
            if(ss1.equals(ss2)){
                System.out.println("The given strings are the Anagrams");
            }
        }

    }

}
