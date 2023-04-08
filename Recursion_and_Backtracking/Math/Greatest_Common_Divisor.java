import java.util.*;
class Greatest_Common_Divisor{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter 1st Number: ");
    int a = sc.nextInt();
    System.out.print("Enter 2nd Number: ");
    int b = sc.nextInt();
    System.out.println(gcd(a,b));
  }
  static int gcd(int a,int b){
    if(a%b==0){
      return b;
    }else{
      return (gcd(b, a%b));
    }
  }
}