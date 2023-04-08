import java.util.*;
import java.lang.*;

class Power_Of_Number {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    System.out.print("Enter the power to find: ");
    int power = sc.nextInt();
    System.out.println(n + " power " + power + " is " + power_to_find(n, power));
  }

  static int power_to_find(int n, int power) {
    if (power == 1) {
      return n;
    }
    return (n * power_to_find(n, --power));
  }
}