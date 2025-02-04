import java.util.Scanner;

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

class BinaryTree{
    Node root;
    Scanner sc = new Scanner(System.in);
    BinaryTree(){
        root = null;
    }
    Node buildTree(){
        int data = sc.nextInt();
        if(data == -1)
            return null;
        
        Node newNode = new Node(data);
        newNode.left = buildTree();
        newNode.right = buildTree();

        return newNode;
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
}

public class TreesDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = tree.buildTree();
        System.out.println("-----INORDER TRAVERSAL-----");
        tree.inorder(tree.root);
        System.out.println("");
        System.out.println("-----PREORDER TRAVERSAL-----");
        tree.preorder(tree.root);
        System.out.println(" ");
        System.out.println("-----POSTORDER TRAVERSAL-----");
        tree.postorder(tree.root);

    }   
}