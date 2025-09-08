import java.util.Scanner;
public class CelToForn {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        float cel,fh;
        System.out.println("Enter the Celcius value");
        Scanner sc=new Scanner(System.in);
        cel=sc.nextFloat();
        fh=(cel*9/5)+32;
        System.out.println("The converted forien heat was:"+fh);
    }

}
