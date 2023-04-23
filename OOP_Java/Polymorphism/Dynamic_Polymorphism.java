import java.util.*;
class Dynamic_Polymorphism{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("With method Overriding...Check github for code.... ");
    Model obj1 = new Samsung();
    obj1.Processor();
    Model obj2 = new Apple();
    obj2.Processor();
    Model obj3 = new Asus();
    obj3.Processor();
  }
}

class Model{
  void Processor(){
    System.out.println("Specifying the model");
  }
}

class Samsung extends Model{
  void Processor(){
    System.out.println("Model class with Samsung that has Exynos Processor");
  }
}

class Apple extends Model{
  @Override
  void Processor(){
    System.out.println("Model class with Apple that has A15 Processor");
  }
}

class Asus extends Model{
  @Override
  void Processor(){
    System.out.println("Model class with Asus that has Snapdragon Processor");
  }
}