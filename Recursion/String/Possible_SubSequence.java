import java.util.*;
class Possible_SubSequence{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string to find it's Subsequence: ");
    String input = sc.nextLine();
    System.out.println("The Possible subsequences are: ");
    subsequence("",input);
  }
  static void subsequence(String out, String input){
    if(input.length()==0){
      if(out.length()==0){
        return;
      }
      System.out.println(out);
      return;
    }
    subsequence(out+input.charAt(0),input.substring(1));
    subsequence(out+"",input.substring(1));
  }
}