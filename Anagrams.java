import java.util.Scanner;
public class Anagrams {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter the 2 Strings");
        String s1=sc.nextLine().toLowerCase();
        String s2=sc.nextLine().toLowerCase();
        @SuppressWarnings("StringBufferMayBeStringBuilder")
        StringBuffer sb1=new StringBuffer(s1);
        @SuppressWarnings("ReplaceStringBufferByString")
        StringBuffer sb2=new StringBuffer(s2);
        if(sb1.length()==sb2.length()){
            for(int i=0;i<sb1.length();i++){
                for(int j=0;j<sb2.length();j++){
                    if(sb1.charAt(i)==sb2.charAt(j)){
                         count++;
                    }
                }
            }
        }
        if(count==sb1.length()){
            System.out.println("The give Strings was Anagrams");
        }
        else{
            System.out.println("The given Strings are not Anagrams");
        }

    }

}
