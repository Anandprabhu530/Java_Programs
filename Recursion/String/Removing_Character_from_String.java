import java.util.*;
class Removing_Character_from_String{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the String: ");
    String input = sc.nextLine();
    System.out.print("Enter the character to remove from the string: ");
    char cmp = sc.next().charAt(0);
    System.out.println("The String after the character removal is: ");
    System.out.println(string_removal(input,cmp));
  }
  static String string_removal(String input, Character cmp){
    if(input.length()==0){
      return "";
    }
    char a = input.charAt(0);
    if(a==cmp){
      return "" + string_removal(input.substring(1) ,cmp);
    }
    return a + string_removal(input.substring(1) ,cmp);
  }
}