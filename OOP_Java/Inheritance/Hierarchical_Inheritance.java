import java.util.*;

class Hierarchical_Inheritance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter Your age: ");
    int age = sc.nextInt();
    Persondetails01 obj1 = new Persondetails01(name, age);
    Persondetails02 obj2 = new Persondetails02(name, age);
    System.out.println("Object1 ans : " + obj1.name + " is " + obj1.age + " year's old");
    System.out.println("Object2 ans : " + obj2.name + " is " + obj2.age + " year's old");
  }
}

class Person {
  String name;

  Person() {
    this.name = "Default_User";
  }

  Person(String name) {
    this.name = name;
  }
}

class Persondetails01 extends Person {
  int age;

  Persondetails01() {
    this.age = -1;
  }

  Persondetails01(String name, int age) {
    super(name);
    this.age = age;
  }
}

class Persondetails02 extends Person {
  int age;

  Persondetails02() {
    this.age = -1;
  }

  Persondetails02(String name, int age) {
    super(name);
    this.age = age;
  }
}