import java.util.*;
class Static_Polymorphism{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("Enter the third number: ");
    int c = sc.nextInt();
    System.out.print("Method overloading with first 2 operators: ");
    Helper obj1 = new Helper(a,b);
    System.out.println();
    System.out.print("Method overloading with the 3 operators: ");
    Helper obj2 = new Helper(a,b,c);
    System.out.println();
  }
}
class Helper{
  int a;
  int b;
  int c;
  Helper(int a, int b){
    this.a = a;
    this.b = b;
    System.out.print(a+b);
  }
  Helper(int a,int b,int c){
    this.a = a;
    this.b = b;
    this.c = c;
    System.out.print(a+b+c);
  }
}