import java.util.*;
class One_Digit_Sum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int n = sc.nextInt();
    System.out.println("The count reduced to 1 digit is " + count(n));
  }
  static int count(int n){
    int ans = 0;
    while(n!=0){
      ans+=n%10;
      n/=10;
    }
    if(ans>9){
      return count(ans);
    }
    return ans;
  }
}