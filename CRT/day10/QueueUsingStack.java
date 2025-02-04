
import java.util.Stack;

public class QueueUsingStack {
    public static void main(String[] args) {
        SQueue q = new SQueue();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        
        System.out.println(q.deQueue());
        System.out.println(q);
    }
}

class SQueue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    void enQueue(int data){
        while(!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(data);
        while(!s2.isEmpty())
            s1.push(s2.pop());

    }

    int deQueue(){
        return s1.pop();
    }

    @Override
    public String toString() {
        String ans="Queue: ";
        for(int i=s1.size()-1;i>=0;i--){
            ans = ans+s1.elementAt(i)+" ";
        }
        return ans;
    }
    
}