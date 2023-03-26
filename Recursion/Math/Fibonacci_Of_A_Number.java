import java.util.*;
class Fibonacci_Of_A_Number{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int n = sc.nextInt();
    System.out.println(fibonacci(n));
  }
  static int fibonacci(int n){
    if(n==0 || n==1){
      return n;
    }
    return (fibonacci(n-1) + fibonacci(n-2));
  }
}