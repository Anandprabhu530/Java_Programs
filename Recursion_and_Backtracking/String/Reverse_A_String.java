import java.util.*;
class Reverse_A_String{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Word to reverse: ");
    String input = sc.nextLine();
    int length = input.length()-1;
    System.out.println(reverse(length,input));
  }
  static String reverse(int length,String input){
    if(length==0){
      return input.charAt(0)+"";
    }
    return (input.charAt(length)+reverse(--length,input));
  }
}