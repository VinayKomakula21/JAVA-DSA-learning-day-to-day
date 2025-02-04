public class LinkedListDemo {
    public static void main(String[] args) {
        SLList lst = new SLList();

        lst.insert(10);
        lst.insert(20);
        lst.insert(30);
        lst.insert(40);


        lst.print();

    }
}

class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}


class SLList{
    Node head;
    SLList(){
        head = null;
    }
    boolean isListEmpty(){
        return head == null;
    }
    void insert(int data){
        Node newNode = new Node(data);
        if(isListEmpty()){
            head = newNode;
        }
        else{
            Node tmp = head;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }
    void insertAtBegining(int data){
        Node newNode =new Node(data);
        if(isListEmpty())
            head.next=newNode;
        else{
            Node tmp = head.next;
            head.next = newNode;
            newNode.next = tmp;
        }
    }
    void insertAfter(int data,int ele){
        Node newNode = new Node(data);
        if(isListEmpty()){
            head = newNode;
        }
        else{
            Node tmp = head;
            
            while(tmp.next != null){
                if(tmp.data != ele)    
                    tmp = tmp.next;
                else
                    break;
            
            }
            tmp.next=newNode;
        }
    }
    void print(){
        if(isListEmpty())
            System.out.println("List: No elements");
        else{
            Node tmp = head;
            while(tmp.next != null){
                System.out.print(tmp.data+"-->");
                tmp = tmp.next;
            }
            System.out.println(tmp.data);
        }
    }
}