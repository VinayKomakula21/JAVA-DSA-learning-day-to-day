import java.util.Scanner;

/*
given a stock price for n days,your task is find the maximum profit, 
but you are allowed to buy or sell only one time.

Input:
6 
6 4 1 3 2 5

output:
4
*/
public class Demo {
    static int findMaxProfit(int n,int[] prices){
        int finalProfit = 0;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int currentProfit = prices[i] - smallest;
            finalProfit = Math.max(finalProfit, currentProfit);
            smallest = Math.min(smallest, prices[i]);
        }

        return finalProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for(int i = 0; i < n; i++)
            prices[i] = sc.nextInt();
        
        System.out.println(findMaxProfit(n, prices));
    }
}
