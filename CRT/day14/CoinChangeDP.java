
import java.util.Scanner;

public class CoinChangeDP {
    static int getMinCoins(int[] coins, int target) {
        if(target <= 0)
            return 0;

        int[] buffer = new int[target+1];

        for(int i = 1; i <= target; i++) {
            buffer[i] = Integer.MAX_VALUE;
            for(int coin: coins) {
                if(coin <= target && i-coin >= 0 && buffer[i-coin] != Integer.MAX_VALUE)
                    buffer[i] = Math.min(buffer[i], 1+buffer[i-coin]);
            }
        }
        if(buffer[target] == Integer.MAX_VALUE)
            return -1;
        return buffer[target];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++)
            coins[i] = sc.nextInt();
        int target = sc.nextInt();

        System.out.println(getMinCoins(coins, target));
    }
}
