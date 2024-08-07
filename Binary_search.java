class Node{
    // It creates a node 
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
    }
}

class BinaryTree{

    Node root;
    // This method is use to insert value in Tree
    public void insert(int data){
        root =  insertRec(root, data); 
    }

    // This recursion method is use for repeting things in tree
    public Node insertRec(Node root, int data){
        if(root == null){
            root = new Node(data);
        }
        else if (data < root.data) {
            root.left = insertRec(root.left, data);            
        }
        else if (data > root.data) {
            root.right = insertRec(root.right, data);            
        }
        return root;
    }

    // Traversal 
    // Inorder left->root->right
    public void inOrder(){
        System.out.println("Traversal using inorder");
        inOrderRec(root);
    }

    public void inOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.data+" ");
            inOrderRec(root.right);
        }
    }
    // PreOrder root->left->right
    public void preOrder(){
        System.out.println();
        System.out.println("Traversal using preorder");
        preOrderRec(root);
    }

    public void preOrderRec(Node root){
        if(root != null){
            System.out.print(root.data+" ");
            inOrderRec(root.left);
            inOrderRec(root.right);
        }
    }

    //Postorder  left->right->root
    public void postOrder(){
        System.out.println();
        System.out.println("Traversal using postorder");
        postOrderRec(root);
    }

    public void postOrderRec(Node root){
        if(root != null){
            inOrderRec(root.left);
            inOrderRec(root.right);
            System.out.print(root.data+" ");
        }
    }

}


public class Binary_search {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(23);
        tree.insert(12);
        tree.insert(10);
        tree.insert(34);
        tree.insert(55);
        tree.insert(9);

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
