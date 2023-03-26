// Quick Sort
import java.util.*;
class Quick_Sort{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("---------Quick Sort----------");
    System.out.print("Enter the number of Elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements: ");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    quick(arr,0,arr.length-1);
    System.out.println("The sorted array is " + Arrays.toString(arr));
  }
  static void quick(int[] arr, int first, int last){
    if(first>=last){
      return;
    }
    int start = first;
    int end = last;
    int mid = start + (end - start)/2;
    int pivot = arr[mid];
    while(start<=end){
      while(arr[start]<pivot){
        start++;
      }
      while(arr[end]>pivot){
        end--;
      }
      if(start<=end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    quick(arr,first,end);
    quick(arr,start,last);
  }
}