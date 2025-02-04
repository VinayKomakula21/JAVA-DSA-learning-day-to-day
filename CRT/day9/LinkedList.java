import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLList lst = new SLList();
        String[] input = sc.nextLine().split(" ");
        for(String data:input){
            lst.insert(Integer.parseInt(data));
        }
        lst.print();
        int k=sc.nextInt();
        lst.head=lst.reverseListK(lst.head, k);
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
    boolean removeElement(int ele){
        if(isListEmpty()){
            return false;
        }
        else if(head.data == ele){
            head = head.next;
            return true;
        }
        else{
            Node tmp = head;
            Node prev = null;
            while(tmp.next != null && tmp.data != ele){
                prev = tmp;
                tmp = tmp.next;
            }
            if(tmp != null){
                prev.next=tmp.next;
                return true;
            }
        }
        return false;
    }
    int removePosition(int pos){
        if(isListEmpty()){
            return -1;
        }
        if(pos == 0){
            Node tmp = head;
            head = head.next;
            return tmp.data;
        }
        Node tmp = head,prev = null;
        while(tmp != null && pos > 0){
            prev = tmp;
            tmp = tmp.next;
            pos--;
        }
        if(tmp != null){
            prev.next=tmp.next;
            return tmp.data;
        }
        return -1;
    }
    //finding middle element
    int findMiddle(Node head){
        Node slow = head,fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.data;
    }
    //remove kth element from last
    int deletelastK(Node head,int k){
        Node t1 = head,t2 = head,prev=null;
        while (t2 != null) { 
            if(k>0){
                t2=t2.next;
                k--;
            }
            else{
                prev=t1;
                t2=t2.next;
                t1=t1.next;
            }
        }
        prev.next=t1.next;
        return t1.data;
    }
    //reversing a list
    int reverseList(){
        Node prev = null,curr = head,nxt = null;
        while(curr != null){
            nxt = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nxt;
        }
        head = prev;
        return head.data;
    }
    //reverse in k groups
    Node reverseListK(Node head,int k){
        Node prev = null,curr = head,nxt = null;
        int count=0;
        while(count<k && curr != null){
            nxt = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nxt;
            count++;
        }
        if(nxt!=null){
            head.next = reverseListK(nxt,k);
        }
        return prev;
    }

    //cycle detection in the list
    void cycleExist(){
        
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