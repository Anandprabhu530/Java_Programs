import java.util.*;

class Sum_Of_Digits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = sc.nextInt();
    int total = 0;
    System.out.println(sum(n, total));
  }

  static int sum(int n, int total) {
    if (n == 0) {
      return total;
    }
    total += n % 10;
    n /= 10;
    return sum(n, total);
  }
}