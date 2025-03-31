package Trees;

public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left; 
        this.right = right;
    }



    public void bfs() {


        
    }


    /*
     * In-order traversal of a binary tree in time complexity O(n)
     */
    public void inOrderDFS(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrderDFS(root.left);
            System.out.println(root.value);
            inOrderDFS(root.right);
        }
    }

    public void preOrderDFS(TreeNode root) {
        if (root == null) {
            return;
        } else {
            System.out.println(root.value);
            preOrderDFS(root.left);
            preOrderDFS(root.right);
        }
    }

    public void postOrderDFS(TreeNode root) {
        if (root == null) {
            return;
        } else {
            postOrderDFS(root.left);
            postOrderDFS(root.right);
            System.out.println(root.value);
        }
    }
}
