public class MethodOverloading {
    public static void main(String [] args){
        AdvCalc ad=new AdvCalc();
        ad.add(3,2.5);
        ad.add(3,2);
    }
}
class Calc{
    public void add(int n1,int n2){
      System.out.println(n1*n2);   
    }
}
class AdvCalc extends Calc{
    public void add(int n1,double n2){
        System.out.println(n1*n2);
    }
}
