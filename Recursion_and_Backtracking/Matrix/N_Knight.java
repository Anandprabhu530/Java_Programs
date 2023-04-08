import java.util.*;
class N_Knight{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of grid: ");
    int n = sc.nextInt();
    boolean[][] check = new boolean[n][n];
    Knight_Possible(check, 0);
  }
  static void Knight_Possible(boolean[][] check,int row){
    if(row==check.length){
      display(check);
      System.out.println();
      return;
    }
    for(int i=0;i<check.length;i++){
      if(capable(check,row,i)){
        check[row][i] = true;
        Knight_Possible(check, row+1);
        check[row][i] = false;
      }
    }
    return;
  }
  static boolean capable(boolean[][] check, int row, int col){
    if((row-2>-1 && row-2<check.length) && (col+1>=0 && col+1<check.length) && check[row-2][col+1]){
      return false;
    }
    if((row-2>-1 && row-2<check.length) && (col-1>=0 && col-1<check.length) && (check[row-2][col-1])){
      return false;
    }
    if((row-1>-1 && row-1<check.length) && (col+2>=0 && col+2<check.length) && check[row-1][col+2]){
      return false;
    }
    if((row-1>-1 && row-1<check.length) && (col-2>=0 && col-2<check.length) && check[row-1][col-2]){
      return false;
    }
    return true;
  }
  static void display(boolean[][] check){
    for(int i=0;i<check.length;i++){
      for(int j=0;j<check.length;j++){
        if(check[i][j]){
          System.out.print("K ");
        }else{
          System.out.print("X ");
        }
      }
      System.out.println();
    }
  }
}