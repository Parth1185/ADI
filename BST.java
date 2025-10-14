class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}

public class BST {

    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val <= root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    public static void print(TreeNode root) {
        if (root == null) return;
        print(root.left);
        System.out.print(root.val + " ");
        print(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = null;
        int[] arr = {5, 3, 8, 1, 4, 7, 9, 2, 6, 10, 8, 5};
        for (int val : arr) root = insert(root, val);
        print(root);
    }
}
