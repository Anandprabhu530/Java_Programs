import java.util.*;

class Multilevel_Inheritance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.print("Enter your age: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter your address: ");
    String address = sc.nextLine();
    Address_Setter obj = new Address_Setter(name, age, address);
    System.out.println("Your name is " + obj.name + ", your age is " + obj.age + " and you live at " + obj.address);
  }
}

class Name_Setter extends Multilevel_Inheritance {
  String name;

  Name_Setter() {
    this.name = "Default_User";
  }

  Name_Setter(String name) {
    this.name = name;
  }
}

class Age_Setter extends Name_Setter {
  int age;

  Age_Setter() {
    this.age = -1;
  }

  Age_Setter(String name, int age) {
    super(name);
    this.age = age;
  }
}

class Address_Setter extends Age_Setter {
  String address;

  Address_Setter() {
    this.address = "Space";
  }

  Address_Setter(String name, int age, String address) {
    super(name, age);
    this.address = address;
  }
}