
import java.util.ArrayDeque;
import java.util.Queue;

class Cell{
    int row,col;
    Cell(int row,int col){
        this.row = row;
        this.col = col;
    }
}
public class IslandDemo {
    static void Ibfs(int row,int col,int[][] grid,boolean[][] isVisited){
        Queue<Cell> queue = new ArrayDeque<>();

        queue.offer(new Cell(row, col));
        isVisited[row][col] = true;

        while(!queue.isEmpty()){
            int cRow = queue.peek().row;
            int cCol = queue.peek().col;

            for(int rDel = -1;rDel <= 1;rDel++){
                for(int cDel = -1;cDel <=1;cDel++){
                    int nbrRow = cRow + rDel;
                    int nbrCol = cCol + cDel;
                    if(isSafe(nbrRow,nbrCol,grid) && grid[nbrRow][nbrCol] == 1 && isVisited[nbrRow][nbrCol] == false){
                        isVisited[nbrRow][nbrCol] = true;
                        queue.offer(new Cell(nbrRow, nbrCol));
                    }
                }
            }
            queue.poll();
        }

    }
    static boolean isSafe(int row,int col,int[][] grid){
        return (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length);
    }
    static int countIslands(int[][] grid){
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] isVisited = new boolean[rows][cols];
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1 && isVisited[i][j] == false){
                    count++;
                    Ibfs(i,j,grid,isVisited);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid ={
            {1,0,0,1,1},
            {0,1,0,1,0},
            {0,0,0,0,0},
            {1,1,0,0,1},
            {0,1,0,0,1}
        };

        System.out.println(countIslands(grid));
    }
}
