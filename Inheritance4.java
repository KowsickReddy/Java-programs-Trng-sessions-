public class Inheritance4 {
  public static void main(String[] args){
      Dog d =new Dog();
      d.describe();
  }
}
class Animal{
    public void describe(){
        System.out.println("This is a animal:");
    }
}
class Mammal extends Animal{
    public void describe(){
        System.out.println("This is a mamel");
    }
}
class Dog extends Animal{
    public void describe(){
        System.out.println("This is a dog:");
    }
}