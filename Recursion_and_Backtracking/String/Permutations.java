import java.util.*;
class Permutations{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String: ");
    String input = sc.nextLine();
    System.out.println("The possible permutation of " + input + " are: ");
    possible_permutation("",input);
  }
  static void possible_permutation(String output, String input){
    if(input.isEmpty()){
      System.out.println(output);
      return;
    }
    char ch = input.charAt(0);
    for(int i=0;i<=output.length();i++){
      String first = output.substring(0,i);
      String last = output.substring(i,output.length());
      possible_permutation(first+ch+last, input.substring(1));
    }   
  }
}