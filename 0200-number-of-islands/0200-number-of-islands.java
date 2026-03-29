class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++ ){
                if(grid[i][j] == '1'){
                    count++;
                    bfs(grid,i,j,row , col);
                    
                }
            }
        }
        return count;
    }
    public void bfs(char[][] grid , int i , int j, int row , int col){

        Queue<int[]> q = new LinkedList<>();
        q.offer( new int[]{i,j});
        grid[i][j] = '0';

        int[][] direction = {{1,0} , {-1,0} , {0,1} , {0,-1}};
        while(!q.isEmpty()){
            int[] cell = q.poll();

            for(int[] dir : direction ){
                int newrow = cell[0] + dir[0];
                int newcol = cell[1] + dir[1];

                if(newrow >= 0 && newcol >= 0 && newrow < row && newcol < col && grid[newrow][newcol] == '1'){
                    q.offer(new int[]{newrow,newcol});
                    grid[newrow][newcol] = '0';
                }
            }
        }
    }
}

