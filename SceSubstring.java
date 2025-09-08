import java.util.Arrays;
import java.util.Scanner;
public class SceSubstring {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int l=sc.nextInt();
        int n=str.length();
        int count=0;
        int maxcout=0;
        for(int i=0;i<n;i+=l){
            int end=Math.min(i+l, n);
            String group=str.substring(i,end);
            count=0;
            for(int j=0;j<group.length();j++){
                if(group.charAt(j)=='a'){
                    count++;
                }
            }
            if(count>maxcout){
                maxcout=count;
            }
        }
        System.out.println(maxcout);
    }
}
