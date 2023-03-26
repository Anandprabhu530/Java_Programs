//Merge sort
import java.util.*;
public class Merge_Sort{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("------------Merge Sort------------");
    System.out.print("Enter the total number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter all elements in the array: ");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    int[] out = merge_sort(arr);
    System.out.print("The sorted array is: ");
    System.out.println(Arrays.toString(out));
  }
  
  static int[] merge_sort(int[] arr){
    if(arr.length==1){
      return arr;
    }
    int mid = arr.length/2;
    int[] left = merge_sort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = merge_sort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left,right);
  }
  static int[] merge(int[] left, int[] right){
    int[] ans = new int[left.length+right.length];
    int i=0;
    int j=0;
    int k=0;
    while(i<left.length && j<right.length){
      if(left[i]<right[j]){
        ans[k++] = left[i++];
      }else{
        ans[k++] = right[j++];
      }
    }
    while(i<left.length){
      ans[k++] = left[i++];
    }
    while(j<right.length){
      ans[k++] = right[j++];      
    }
    return ans;
  }
}