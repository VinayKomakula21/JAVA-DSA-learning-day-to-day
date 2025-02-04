
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Activity implements Comparable<Activity>{
    int start,finish;
    Activity(int start,int finish){
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Activity next) {
        return this.finish - next.finish;
    }

    @Override
    public String toString() {
        return "("+start+","+finish+")";
    }
}
public class MaxNumActivities {
    static int findMax(ArrayList<Activity> activities){
        int count=0;
        Collections.sort(activities);

        Activity selected = activities.get(0);
        System.out.println(selected);
        count++;

        for(int i=1;i<activities.size();i++){
            Activity nextAct = activities.get(i);
            if(selected.finish <= nextAct.start){
                System.out.println(nextAct);
                count++;
                selected = nextAct;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Activity> activities = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int start = sc.nextInt();
            int finish = sc.nextInt();
            activities.add(new Activity(start, finish));
        }

        System.out.println(findMax(activities));
    }
}
