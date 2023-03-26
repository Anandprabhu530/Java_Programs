import java.util.*;
class Decimal_To_Binary{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Decimal Number: ");
    int n = sc.nextInt();
    String out = "";
    System.out.println(binary(n,out));
  }
  static String binary(int n,String out){
    if(n==1 || n==0){
      return out = n + "" +out;
    }
    out = n%2 + "" + out;
    return binary(n/2,out);
  }
}