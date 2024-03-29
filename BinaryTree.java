class Node{
    int data;
    Node right,left;
    Node(int val){
        this.data=val;
        this.right=this.left=null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree(int val){
        root=new Node(val);
    }
    BinaryTree(){
        root=null;
    }

    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        System.out.println(tree.root.left.right.data);
    }
}
