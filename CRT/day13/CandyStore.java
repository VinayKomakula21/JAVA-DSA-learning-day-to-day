
import java.util.Arrays;
import java.util.Scanner;

public class CandyStore {
    static  int minAmount(int[] candies,int n,int k){
        int minAmt=0;
        Arrays.sort(candies);
        int i=0,end=n-1;
        while(i<=end){
            minAmt = minAmt+candies[i];
            i++;
            end-=2;
        }
        return minAmt;
    }
    static  int maxAmount(int[] candies,int n,int k){
        int maxAmt=0;
        Arrays.sort(candies);
        int i=0,end=n-1;
        while(i<=end){
            maxAmt = maxAmt+candies[end];
            end--;
            i+=k;
        }
        return maxAmt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] candies = new int[n];
        for(int i=0;i<n;i++){
            candies[i]=sc.nextInt();
        }

        System.out.println(minAmount(candies,n,k));
        System.out.println(maxAmount(candies,n,k));
    }
}
