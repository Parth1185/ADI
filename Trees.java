class Node {
    int d;
    Node left;
    Node right;

    Node(int val) {
        d = val;
        left = right = null;
    }
}

public class Trees {
    public static void print(Node root) {
        if (root == null) return;
        System.out.print(root.d + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        print(root);
    }

}
