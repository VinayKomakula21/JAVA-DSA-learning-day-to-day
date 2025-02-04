public class StackDemo {
    public static void main(String[] args) {
        LLStack stk = new LLStack();

        stk.push(10);
        stk.push(20);
        stk.push(30);
        stk.push(40);

        stk.pop();
        stk.print();
    }
}
class SNode{
    int data;
    SNode next;
    SNode(int data){
        this.data = data;
        this.next = null;
    }
}
class LLStack{
    SNode top;
    LLStack(){
        top = null;
    }
    boolean isEmpty(){
        return top == null;
    }
    void push(int data){
        SNode newNode = new SNode(data);
        newNode.next = top;
        top = newNode;
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            SNode del = top;
            top=top.next;
            return del.data;
        }
    }
    void print(){
        if(isEmpty()){
            System.out.println("empty stack");
        }
        else{
            SNode tmp = top;
            while(tmp != null){
                System.out.print(tmp.data+" ");
                tmp = tmp.next;
            }
        }
    }
}