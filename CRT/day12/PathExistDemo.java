public class PathExistDemo {
    static boolean traverse(int row, int col, int[][] grid, boolean[][] isVisited) {
        if(!isSafe(row, col, grid) || grid[row][col] == 0 || isVisited[row][col])
            return false;

        if(grid[row][col] == 2)
            return true;

        isVisited[row][col] = true;

        boolean up = traverse(row-1, col, grid, isVisited);
        boolean right = traverse(row, col+1, grid, isVisited);
        boolean down = traverse(row+1, col, grid, isVisited);
        boolean left = traverse(row, col-1, grid, isVisited);

        return up || right || down || left;

    }

    static boolean isSafe(int row,int col,int[][] grid){
        return (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length);
    }
    
    static boolean isPathExist(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] isVisited = new boolean[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    return traverse(i, j, grid, isVisited);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {0,3,3,2},
            {3,3,0,0},
            {0,3,0,0},
            {3,3,1,0}
        };

        System.out.println(isPathExist(grid));
    }
}
