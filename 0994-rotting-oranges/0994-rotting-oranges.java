class Solution {
    public int orangesRotting(int[][] grid) {

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for (int i = 0 ; i < grid.length ; i++) {
            for (int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int mins = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

        while(!q.isEmpty() && fresh > 0){
            int n = q.size();
            for(int i = 0 ; i < n ; i++){
                int[] currrotten = q.poll();
                for(int[] d : dir){

                    int r = currrotten[0] + d[0];
                    int c = currrotten[1] + d[1];
                    if(r>=0 && c>=0 && r< grid.length && c< grid[0].length && grid[r][c] == 1){
                        grid[r][c] =2;
                        fresh--;
                        q.offer( new int[]{r,c});
                    }
                }
            }
            mins++;
        }
        return fresh == 0 ? mins : -1;
    }
}