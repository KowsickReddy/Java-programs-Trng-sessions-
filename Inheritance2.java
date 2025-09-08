public class Inheritance2 {
    public static void main(String[] args){
        Rectangle rc=new Rectangle();
        rc.area();
        Circle cc=new Circle();
        cc.area
    }
}
class Shape{
    public void area(){
        System.out.println("This is the method of thre shape:");
    }
}
class Circle extends Shape{
    public void area(){
        System.out.println("This is the method fo the circle");
    }
}
class Rectangle extends Shape{
    public  void area(){
        System.out.println("This is the method of the Rectangle");
     }
}