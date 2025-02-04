
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = right = null;
    }

    @Override
    public String toString() {
        return left + " " + data + " " + right;
    }
}

class BinarySTree{
    Node root;
    BinarySTree(){
        root = null;
    }
    Node bstInsertion(Node root,int data){
        if(root == null){
            return new Node(data);
        }
        if(data < root.data){
            root.left = bstInsertion(root.left, data);
        }
        else{
            root.right = bstInsertion(root.right, data);
        }
        return root;
    }

    void inorder(Node root){
        if(root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void preorder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    void levelOrder(Node root,Node dummy){
        if(root == null)
            return;
        Queue<Node> Q = new ArrayDeque<>();
        Q.offer(dummy);
        Q.offer(root);
        while(!Q.isEmpty()){
            Node tmp = Q.poll();
            if(tmp == dummy){
                System.out.println();
                if(!Q.isEmpty())
                    Q.offer(dummy);
            }
            else{
            System.out.print(tmp.data+" ");
            if(tmp.left != null)
                Q.offer(tmp.left);
            if(tmp.right != null)
                Q.offer(tmp.right);
            }
        }
    }
    void leftView(Node root,Node dummy){
        if(root == null)
            return;
        Queue<Node> Q = new ArrayDeque<>();
        Q.offer(dummy);
        Q.offer(root);
        while(!Q.isEmpty()){
            Node tmp = Q.poll();
            if(tmp == dummy){
                if(!Q.isEmpty())
                    Q.offer(dummy);
                else
                    break;
                System.out.println(Q.peek().data);
            }
            else{
            if(tmp.left != null)
                Q.offer(tmp.left);
            if(tmp.right != null)
                Q.offer(tmp.right);
            }
        }
    }

    void traverse(Node root, TreeMap<Integer, ArrayList<Integer>> columns, int distance) {
        if(root == null)
            return;
        columns.putIfAbsent(distance, new ArrayList<Integer>());
        columns.get(distance).add(root.data);

        traverse(root.left, columns, distance-1);
        traverse(root.right, columns, distance+1);
    }

    void verticalOrder(Node root) {
        TreeMap<Integer, ArrayList<Integer>> columns = new TreeMap<>();

        traverse(root, columns, 0);

        for(int key: columns.keySet()) {
            for(int element: columns.get(key))
                System.out.print(element + " ");
        }
    }
}

public class BSTree {
    public static void main(String[] args) {
        int[] values = {20, 15, 25, 12, 13, 78, 45, 30, 5, 8};
        BinarySTree tree = new BinarySTree();
        
        for(int value: values)
            tree.root = tree.bstInsertion(tree.root, value);

        
        tree.verticalOrder(tree.root);
    }
}