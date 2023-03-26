//Cyclic sort for range 1 to n
import java.util.*;
class Cyclic_Sort{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("----------Cyclic Sort----------");
    System.out.print("Enter the Number of elements: ");
    int n = sc.nextInt();
    System.out.println("Enter the Elements from 1 to N: ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int k = 0;
    while(k<arr.length){
      int c = arr[k]-1;
      if(arr[k]!=arr[c]){
        swap(arr,k,c);
      }else{
        k++;
      }
    }
    System.out.print("The sorted Array is: ");
    System.out.println(Arrays.toString(arr));
  }
  static void swap(int[] arr, int k, int c){
    int temp = arr[k];
    arr[k] = arr[c];
    arr[c] = temp;
  }
}