import java.util.*;
class Possible_Ways_To_Travel{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the grid length: ");
    int n = sc.nextInt();
    System.out.println("The possible patterns are: ");
    pattern(n,0,0,"");
    System.out.println();
  }
  static void pattern(int n, int r, int c, String out){
    if(r==n-1 && c==n-1){
      System.out.println(out);
      return;
    }
    if(r<n-1){
      pattern(n,r+1,c,out+"D");
    }
    if(c<n-1){
      pattern(n, r, c+1, out+"R");
    }
  }
}