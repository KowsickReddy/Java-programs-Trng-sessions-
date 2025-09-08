import java.util.Scanner;
public class Exp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int cnt=0;
        StringBuffer sb=new StringBuffer(s);
        int len=sb.length();
        for(int i=0;i<=len-1;i++){
            for(int j=0;j<=len-1;j++){
                if(sb.charAt(i)==sb.charAt(j)){
                    sb.setCharAt(j, '0');
                }
            }
        }
        for(int i=0;i<len;i++){
            if(sb.charAt(i)!='0'){
                System.out.println(sb.charAt(i));
                cnt++;
            }
        }
        System.out.println("The length of the substring was:"+cnt);
    }

}
