
import java.util.Scanner;

public class TreeDS {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = tree.buildTree();
        tree.postorder(tree.root);
    }
}

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

class BinaryTree{
    Node root;
    Scanner snr = new Scanner(System.in);
    BinaryTree(){
        root = null;
    }
    
    Node buildTree(){
        //read a value and insert it
        int data = snr.nextInt();

        if(data == -1){
            return null;
        }
        Node newNode = new Node(data);
        newNode.left = buildTree();
        newNode.right = buildTree();
        return newNode;
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
}