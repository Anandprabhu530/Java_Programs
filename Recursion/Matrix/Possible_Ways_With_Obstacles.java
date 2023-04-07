class Possible_Ways_With_Obstacles{
  public static void main(String[] args){
    int[][] grid = {{1,1,1},
                    {1,2,3},
                    {1,2,3}};
    boolean[][] isWater = {{true,true,true},
                           {true,false,true},
                           {true,true,true}};
    ways_To_Travel("",0,0,grid,isWater);
  }
  static void ways_To_Travel(String out, int m, int n, int[][] grid, boolean[][] isWater){
    if(m==grid.length-1 && n==grid[0].length-1){
      System.out.println(out);
      return;
    }
    if(!isWater[m][n]){
      return;
    }
    if(m<grid.length-1){
      ways_To_Travel(out+"D", m+1, n, grid, isWater);
    }
    if(n<grid[0].length-1){
      ways_To_Travel(out+"R", m, n+1, grid, isWater);
    }
  }
}