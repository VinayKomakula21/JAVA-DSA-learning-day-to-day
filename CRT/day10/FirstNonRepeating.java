
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeating {
    static void firstNonRepeat(String str){
        HashMap<Character,Integer> freq = new HashMap<>();
        ArrayDeque<Character> queue = new ArrayDeque<>();

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            queue.offer(curr);
            freq.putIfAbsent(curr, 0);
            freq.put(curr,freq.get(curr)+1);

            while(!queue.isEmpty() && freq.get(queue.peekFirst()) > 1){
                queue.pollFirst();
            }
            if(queue.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(queue.peekFirst()+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();

        firstNonRepeat(str);
    }
}
