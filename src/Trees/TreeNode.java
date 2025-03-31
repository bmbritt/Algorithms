package Trees;
import java.util.HashSet;
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

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        } else {
            dfs(root.left);
            System.out.println(root.value);
            dfs(root.right);
        }
    }
}
