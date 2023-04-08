//Binary serach with recursion
import java.util.*;
class binary_Search_Recursion{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements: ");
    int n = sc.nextInt();
    System.out.print("Enter the sorted array: ");
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    System.out.print("Enter target element to find: ");
    int target = sc.nextInt();
    System.out.println(binary_Search(arr, 0, n-1, target));
  }
  static int binary_Search(int[] arr, int start, int end, int target){
    if(start>end){
      return -1;
    }
    int mid = start + (end - start)/2;
    if(arr[mid]==target){
      return mid;
    }else if(arr[mid]>target){
      return binary_Search(arr,start,mid-1,target);
    }else{
      return binary_Search(arr, mid+1, end, target);
    }
  }
}