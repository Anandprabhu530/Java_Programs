 //Bubble_Sort
import java.util.*;
class Bubble_Sort{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("---------Bubble Sort----------");
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    System.out.println("Enter the elements to sort");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    bubble_sort(arr);
    System.out.print("The sorted array is: ");
    System.out.println(Arrays.toString(arr));
  }
  static void bubble_sort(int[] nums){
    for(int i=0;i<nums.length;i++){
      for(int j=1;j<nums.length-i;j++){
        if(nums[j-1]>nums[j]){
          int temp = nums[j-1];
          nums[j-1] = nums[j];
          nums[j] = temp;
        }
      }
    }
    return;
  }
}