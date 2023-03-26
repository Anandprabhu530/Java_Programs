import java.util.*;
class Merge_Sort_In_Place{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("----------Merge Sort In-Place---------");
    System.out.print("Enter the Number of Elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the Elements: ");
    for(int i=0;i<n;i++){
      arr[i] = sc.nextInt();
    }
    merge_sort_in_place(arr,0,arr.length);
    System.out.println("The Sorted Array is " + Arrays.toString(arr));
  }
  static void merge_sort_in_place(int[] arr, int start ,int end){
    if(end - start==1){
      return;
    }
    int mid = ( start + end )/ 2;
    merge_sort_in_place(arr,start,mid);
    merge_sort_in_place(arr,mid,end);
    merge_order(arr,start,mid,end);
  }
  static void merge_order(int[] arr, int start, int mid, int end){
    int ans[] = new int[end-start];
    int i =start;
    int j=mid;
    int k=0;
    while(i<mid && j<end){
      if(arr[i]<arr[j]){
        ans[k] = arr[i];
        k++;
        i++;
      }else{
        ans[k] = arr[j];
        k++;
        j++;
      }
    }
    while(i<mid){
      ans[k] = arr[i];
      k++;
      i++;
    }
    while(j<end){
      ans[k] = arr[j];
      k++;
      j++;
    }
    for(int l=0;l<ans.length;l++){
      arr[start+l] = ans[l];
    }
  }
}