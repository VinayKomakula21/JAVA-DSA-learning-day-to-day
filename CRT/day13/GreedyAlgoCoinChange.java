import java.util.Scanner;
/*
given infinite supply of the following coin denominations
10,5,2,1
you also given a target amount n 
*/
public class GreedyAlgoCoinChange {
    static int minCoinsReq(int target){
        int[] denominations = {10,5,2,1};

        int count=0;
        for(int coin:denominations){
            if(target >= coin){
                int howMany= target/coin;
                count += howMany;
                target -= coin*howMany;
            }
            if(target == 0)
                break;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        System.out.println(minCoinsReq(target));
    }
}
