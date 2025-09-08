public class Inheritance3 {
     public static void main(String [] args){
        int n=5;
        Car c=new Car(n);
        //c.Car(int 5);
     }
}
class Vehilcle{
    Vehilcle(){
        System.out.println("The Vehicle constructure was called:");
    }
    Vehicle(int b){
        System.out.println("Integer Vehicle");
    }

}
class Car extends Vehilcle{
    Car(){
        super();
        System.out.println("The Car constructure was called");
    }
     Car(int a){
        System.out.println("Integer car");
    }
}
