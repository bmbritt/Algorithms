package Trees;

import java.util.Arrays;

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

    public void inOrderDFS(TreeNode root) {
        if (root == null) {
            return;
        } else {
            inOrderDFS(root.left);
            System.out.println(root.value);
            inOrderDFS(root.right);
        }
    }

    public void reverseOrderDFS(TreeNode root) {
        if (root == null) {
            return;
        } else {
            reverseOrderDFS(root.right);
            System.out.println(root.value);
            reverseOrderDFS(root.left);
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


    public int kthSmallest(TreeNode root, int k) {
        return -1;
    }

    /*
     * Uses the preorder traversal to identify the root
     * and the inorder traversal to determine left and right subtrees of that root.
     */
     public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        } else {

            int rootVal = preorder[0];
            TreeNode root = new TreeNode(rootVal);

            int mid = -1;
            for (int i = 0; i < inorder.length; i++) {
                if (inorder[i] == rootVal) {
                    mid = i;
                    break;
                }
            }

            root.left = buildTree(Arrays.copyOfRange(preorder, 1, mid + 1), Arrays.copyOfRange(inorder, 0, mid));
            root.right = buildTree(Arrays.copyOfRange(preorder, mid + 1, preorder.length), Arrays.copyOfRange(inorder, mid + 1, inorder.length));

            return root;
        }
     }
}
