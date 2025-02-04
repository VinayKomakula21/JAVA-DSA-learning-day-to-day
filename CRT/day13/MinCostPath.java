
import java.util.Scanner;

public class MinCostPath {
    static int minimumCostPath(int[][] cost,int m,int n){
        int rows = cost.length;
        int cols = cost[0].length;
        int[][] ans = new int[rows][cols];
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(j == cols-1 && i == rows-1)
                    ans[i][j] = cost[i][j];
                else if(i == rows-1)
                    ans[i][j] = cost[i][j]+ans[i][j+1];
                else if(j == cols-1)
                    ans[i][j] = cost[i][j]+ans[i+1][j];
                else{
                    ans[i][j] = cost[i][j]+Math.min(ans[i+1][j],ans[i][j+1]);
                }
            }
        }
        return ans[m][n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cost = {
            {1,2,3},
            {4,8,2},
            {1,5,3}
        };
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(minimumCostPath(cost,m,n));
    }
}

