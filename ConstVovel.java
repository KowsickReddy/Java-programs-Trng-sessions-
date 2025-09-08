import java.util.Scanner;
public class ConstVovel {
    public static void main(String[] args) {
        String str;
        int voe=0,cons=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        str=sc.nextLine();
        String low=str.toLowerCase();
        for(int i=0;i<low.length();i++){
             char c=low.charAt(i);
             if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                voe++;
             }
             else{
                cons++;
             }
        }
        System.out.println("The vowels in the string was:"+voe);
        System.out.println("The consonants in the string was:"+cons);

    }

}
