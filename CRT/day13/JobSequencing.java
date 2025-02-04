
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Job implements Comparable<Job>{
    int deadline,profit;
    Job(int deadline,int profit){
        this.deadline=deadline;
        this.profit=profit;
    }

    @Override
    public int compareTo(Job next) {
        return this.profit - next.profit;
    }

}
public class JobSequencing {
    static int findMaxProfit(ArrayList<Job> lst){
        int maxProfit = 0;
        boolean[] slots = new boolean[lst.size()];
        Collections.sort(lst, Collections.reverseOrder());
        for(Job currJob:lst){
            int currDeadline = currJob.deadline;
            int currProfit = currJob.profit;
            for(int currSlot = currDeadline-1;currSlot>=0;currSlot--){
                if(slots[currSlot] == false){
                    maxProfit += currProfit;
                    slots[currSlot] = true;
                    break;
                }
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Job> lst = new ArrayList<>();
        for(int i=0;i<n;i++){
            int deadline = sc.nextInt();
            int profit = sc.nextInt();
            lst.add(new Job(deadline,profit));
        }

        System.out.println(findMaxProfit(lst));
    }
}
