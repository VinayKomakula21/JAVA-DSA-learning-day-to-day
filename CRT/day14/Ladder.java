
import java.util.Scanner;

public class Ladder {
    static int countWays(int n,int k){
        //base case
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;
        //recursive case 
        int ans = 0;
        for(int jump = 1;jump <= k;jump++){
            ans = ans + countWays(n-jump, k);
        }
        return ans;
    }

    static int countWays_DP(int n,int k,int[] buffer){
        //base case
        if(n == 0)
            return 1;
        if(n < 0)
            return 0;

        //checkpoint
        if(buffer[n] != 0)
            return buffer[n];

        //recursive case 
        int ans = 0;
        for(int jump = 1;jump <= k;jump++){
            ans = ans + countWays_DP(n-jump, k,buffer);
        }
        buffer[n] = ans;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] buffer = new int[n+1];

        System.out.println(countWays_DP(n,k,buffer));
    }
}
