import java.util.*;
class Single_Inheritance {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name: ");
    String name = sc.nextLine();
    name = name.trim();
    System.out.print("Enter your age: ");
    int n = sc.nextInt();
    if (name.length() == 0) {
      Programs_Below obj = new Programs_Below();
      System.out.println("You entered as " + obj.name + " and your age is Default_Age");
    } else {
      Programs_Below obj = new Programs_Below(name, n);
      System.out.println("Your name is " + obj.name + " and your age is " + obj.age);
    }
  }
}
class Sub_Program extends Single_Inheritance {
  String name = "";
  Sub_Program() {
    this.name = "Default_User";
  }
  Sub_Program(String name) {
    this.name = name.trim();
  }
}
class Programs_Below extends Sub_Program {
  int age;
  Programs_Below() {
    this.age = -1;
  }
  Programs_Below(String name, int age) {
    super(name);
    this.age = age;
  }
}