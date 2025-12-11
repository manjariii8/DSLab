// Program to implement BST with insert, delete and search operations
public class Program23 {
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}



    Node root;

    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);

        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null) return false;

        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    private Node findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root;
    }

    public Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);

        else if (key > root.data)
            root.right = delete(root.right, key);

        else {
            if (root.left == null && root.right == null)
                return null;

            else if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            Node minNode = findMin(root.right);
            root.data = minNode.data;
            root.right = delete(root.right, minNode.data);
        }
        return root;
    }
    public void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Program23 bst = new Program23();

        System.out.println("*****Program23 Output*****");
        bst.root = bst.insert(bst.root, 50);
        bst.insert(bst.root, 30);
        bst.insert(bst.root, 20);
        bst.insert(bst.root, 40);
        bst.insert(bst.root, 70);
        bst.insert(bst.root, 60);
        bst.insert(bst.root, 80);

        System.out.println("Inorder (sorted) traversal:");
        bst.inorder(bst.root);

        System.out.println("\n\nSearching 40: " + bst.search(bst.root, 40));
        System.out.println("Searching 90: " + bst.search(bst.root, 90));

        System.out.println("\nDeleting 20...");
        bst.root = bst.delete(bst.root, 20);
        bst.inorder(bst.root);

        

    }
}
