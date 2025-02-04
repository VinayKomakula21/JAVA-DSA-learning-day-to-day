public class QueueDemo {
    public static void main(String[] args) {
        QueueDS q = new QueueDS();

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);

        System.out.println(q);
    }
}
class QNode{
    int data;
    QNode next;
    QNode(int data) {
        this.data = data;
        this.next = null;
    }
}
class QueueDS{
    QNode front,rear;
    QueueDS(){
        front=rear=null;
    }
    void enQueue(int data){
        QNode newNode = new QNode(data);
        if(front == null){
            front = rear = newNode;
        }
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    int deQueue(){
        if(front == null){
            return -1;
        }
        else{
            QNode tmp = front;
            front = front.next;
            if(front == null)
                front = rear = null;
            return tmp.data;
        }
    }

    @Override
    public String toString() {
        String res = "queue: ";
        if(front == null){
            res += "No elements";
        }
        else{
            QNode tmp = front;
            while(tmp != null){
                res = res+ tmp.data +" ";
                tmp = tmp.next;
            }
        }
        return res;
    }

}
