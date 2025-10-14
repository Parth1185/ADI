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
    public static TreeNode remove(int ele, TreeNode root){
        if(root==null) return null;
        else if(ele<root.val) root.left=remove(ele,root.left);
        else if(ele>root.val) root.right=remove(ele,root.right);

        else{
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            if(root.left==null && root.right==null) root=null;  //NO CHILD            
        
            //1 CHILD
            else if(root.left==null) root=root.right;
            else if(root.right==null) root=root.left;            

            //2 CHILDREN
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = null;
        int[] arr = {5, 3, 8, 1, 4, 7, 9, 2, 6, 10, 8, 5};
        for (int val : arr) root = insert(root, val);
        print(root);
        root = remove(8,root);
        print(root);
    }
}
