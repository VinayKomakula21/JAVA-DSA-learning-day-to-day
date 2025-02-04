import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
    int start,finish;
    Meeting(int start,int finish){
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Meeting next) {
        return this.finish - next.finish;
    }
}
public class MeetingRoom {
    static int nMeeting(ArrayList<Meeting> meetings){
        int count=0;
        Collections.sort(meetings);

        Meeting selected = meetings.get(0);
        count++;

        for(int i=1;i<meetings.size();i++){
            Meeting nextMeet = meetings.get(i);
            if(selected.finish < nextMeet.start){
                count++;
                selected = nextMeet;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Meeting> meetings = new ArrayList<>();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int start = sc.nextInt();
            int finish = sc.nextInt();
            meetings.add(new Meeting(start, finish));
        }

        System.out.println(nMeeting(meetings));
    }
}
