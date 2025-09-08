import java.util.Scanner;
public class FrequencyChar {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int cnt=0;
       System.out.println("Enter the String:");
       String s1=sc.nextLine().toLowerCase();
       @SuppressWarnings("ReplaceStringBufferByString")
       StringBuffer sb=new StringBuffer(s1);
       System.out.println("Enter the Character that you want to search the frequency");
       char c=sc.next().toLowerCase().charAt(0);
       for(int i=0;i<sb.length();i++){
        if(sb.charAt(i)==c){
           cnt++;
        }
       }
       System.out.println("The Frequencty of the searched character was:"+cnt);
    }

}
