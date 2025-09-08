public class Inheritance1 {
    public static void main(String[] args){
        Employee emp=new Employee();
        emp.display();
    }
}
class Person{
    String name="krishna";
    int age=18;

}
class Employee extends Person{
    int salary=20000;   
    public void display(){
        System.out.println("The name of the person:"+name+" the age of the person was:"+age+" The salary of the employee:"+salary);
    }
}
