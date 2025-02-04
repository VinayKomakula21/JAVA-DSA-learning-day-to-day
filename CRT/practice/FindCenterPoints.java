
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindCenterPoints {
    static List<Integer> findSumCenterPoints(List<Integer> lst,int n){
        List<Integer> res = new ArrayList<>();
        int totalSum = 0;
        for(int item:lst){
            totalSum += item;
        }
        int postSum = 0;
        int prevSum = 0;
        for(int i=0;i<n;i++){
            postSum = totalSum - prevSum - lst.get(i);

            if(prevSum == postSum){
                res.add(i);
            }
            prevSum +=lst.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();

        for(int i=0;i<n;i++){
            int ele = sc.nextInt();
            lst.add(ele);
        }

        System.out.println(findSumCenterPoints(lst,n));
    }
}
