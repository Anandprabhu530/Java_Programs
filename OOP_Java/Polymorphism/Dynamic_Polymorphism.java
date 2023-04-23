import java.util.*;
class Dynamic_Polymorphism{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("With method Overriding: ");
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
    System.out.println("Samsung with Exynos Processor");
  }
}

class Apple extends Model{
  @Override
  void Processor(){
    System.out.println("Apple with A15 Processor");
  }
}

class Asus extends Model{
  @Override
  void Processor(){
    System.out.println("Asus with Snapdragon Processor");
  }
}