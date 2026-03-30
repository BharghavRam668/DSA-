class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int max = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                if(grid[i][j] == 1){
                    int area = bfs(grid,i,j,row,col);
                    max = Math.max(max,area);
                }
            }
        }
        return max;
    }
    public int bfs(int[][] grid , int i , int j , int row , int col){

        int[][] directions ={{-1,0},{1,0},{0,1},{0,-1}}; 
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{i,j});
        grid[i][j] = 0;
        int count = 1;
        while(!q.isEmpty()){
            int[] cell = q.poll();
            for(int[] dir : directions){
                int newrow = cell[0] + dir[0];
                int newcol = cell[1] + dir[1];

                if(newrow >= 0 && newcol >= 0 && newrow < row && newcol < col && grid[newrow][newcol] == 1){
                    count++;
                    q.offer(new int[]{newrow,newcol});
                    grid[newrow][newcol] = 0 ;
                }
            }
        }
        return count;
    }
}