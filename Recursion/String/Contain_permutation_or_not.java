import java.util.*;
class Contain_permutation_or_not{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string: ");
    String input = sc.nextLine();
    System.out.println("Enter the five Dictionary words: ");
    ArrayList<String> list = new ArrayList<>();
    for(int i=0;i<5;i++){
      list.add(sc.nextLine());
    }
    ArrayList<String> permutations = new ArrayList<>();
    possible_permutations("",input,permutations);
    for(int i=0;i<permutations.size();i++){
      if(list.contains(permutations.get(i))){
        System.out.println("The word "+ permutations.get(i) + " is present at the dictionary");
        return;
      }
    }
    System.out.println("There are no possible permutations at the dictionary");
    return;
  }
  
  static ArrayList<String> possible_permutations(String output, String input, ArrayList<String> permutations){
  if(input.length()==0){
    permutations.add(output);
    return permutations;
  }
  char ch = input.charAt(0);
  for(int i=0;i<=output.length();i++){
    String first = output.substring(0,i);
    String second = output.substring(i,output.length());
    possible_permutations(first+ch+second,input.substring(1),permutations);
    }
    return permutations;
  }
}