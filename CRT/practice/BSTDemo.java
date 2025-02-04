
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.TreeMap;

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return left+" "+data+" "+right;
    }
}

class BSTrees{
    Node root;
    BSTrees() {
        root = null;
    }

    Node bstInsertion(Node root,int value){
        if(root == null)
            return new Node(value);
        if(root.data > value)
            root.left = bstInsertion(root.left, value);
        else
            root.right = bstInsertion(root.right, value);
        return root;
    }

    void inorder(Node root){
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    void preorder(Node root){
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void levelOrder(Node root,Node dummy){
        if(root == null)
            return;
        Queue<Node> queue =  new ArrayDeque<>();
        queue.offer(dummy);
        queue.offer(root);

        while(!queue.isEmpty()){
            Node tmp = queue.poll();
            if(tmp == dummy){
                System.out.println();
                if(!queue.isEmpty())
                    queue.offer(dummy);
            }
            else{
            System.out.print(tmp.data+" ");
            if(tmp.left != null)
                queue.offer(tmp.left);
            if(tmp.right != null)
                queue.offer(tmp.right);
            }
        }
    }

    void leftView(Node root,Node dummy){
        if(root == null)
            return;
        Queue<Node> queue =  new ArrayDeque<>();
        queue.offer(dummy);
        queue.offer(root);

        while(!queue.isEmpty()){
            Node tmp = queue.poll();
            if(tmp == dummy){
                if(!queue.isEmpty())
                    queue.offer(dummy);
                else
                    break;
                System.out.println(queue.peek().data);
            }
            else{
            if(tmp.left != null)
                queue.offer(tmp.left);
            if(tmp.right != null)
                queue.offer(tmp.right);
            }
        }
    }

    void rightView(Node root,Node dummy){
        if(root == null)
            return;
        Queue<Node> queue =  new ArrayDeque<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                Node curr = queue.poll();
                if (i == n - 1) {
                    System.out.print(curr.data);
                    System.out.print(" ");
                }
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
    }

    void traverse(Node root,TreeMap<Integer,ArrayList<Integer>> map,int distance){
        if(root == null)
            return;
        map.putIfAbsent(distance,new ArrayList<>());
        map.get(distance).add(root.data);

        traverse(root.left,map,distance-1);
        traverse(root.right,map,distance+1);
    }

    void verticalOrder(Node root){
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        traverse(root,map,0);

        for(int key:map.keySet()){
            for(int item:map.get(key)){
                System.out.print(item+" ");
            }
        }
    }
    
}

public class BSTDemo {
    public static void main(String[] args) {
        int[] input = {20,15,25,12,13,78,45,30,5,8};
        BSTrees tree = new BSTrees();

        tree.root = null;
        for(int value:input){
            tree.root = tree.bstInsertion(tree.root,value);
        }
        Node dummy = new Node(-1);

        System.out.println("-----INORDER TRAVERSAL-----");
        tree.inorder(tree.root);
        System.out.println("");
        System.out.println("-----PREORDER TRAVERSAL-----");
        tree.preorder(tree.root);
        System.out.println(" ");
        System.out.println("-----POSTORDER TRAVERSAL-----");
        tree.postorder(tree.root);

        System.out.println("");
        System.out.println("level order traversal");
        tree.levelOrder(tree.root,dummy);

        System.out.println();
        System.out.println("LEFT VIEW");
        tree.leftView(tree.root, dummy);

        System.out.println();
        System.out.println("Right View");
        tree.rightView(tree.root,dummy);

        System.out.println();
        System.out.println("vertical order");
        tree.verticalOrder(tree.root);
    }
}
