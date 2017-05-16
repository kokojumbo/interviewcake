import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Marcin Gumkowski on 2016-12-07.
 */
public class BFSandDFS {


    public static void main(String[] args) {
        System.out.println("BFS:");
        bfs(createSampleTree());
        System.out.println("DFS:");
        dfs(createSampleTree());
    }

    /*

    3
   / \
  9  20
 /   /  \
4  15   7

 */
    public static TreeNode createSampleTree() {
        TreeNode root = new TreeNode(3);
        TreeNode a = new TreeNode(9);
        TreeNode a1 = new TreeNode(4);
        TreeNode b = new TreeNode(20);
        TreeNode c = new TreeNode(15);
        TreeNode d = new TreeNode(7);
        root.left = a;
        root.right = b;
        b.left = c;
        b.right = d;
        a.left = a1;
        return root;
    }

    public static void bfs(TreeNode rootNode) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.add(rootNode);
        rootNode.visited = true;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            node.visited = true;
            System.out.println(node.val);
            //add all unvisted nodes to queue
            if (node.left != null && !node.left.visited) {
                queue.add(node.left);
            }
            if (node.right != null && !node.right.visited) {
                queue.add(node.right);
            }
        }

    }


    public static void dfs(TreeNode rootNode) {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        stack.push(rootNode);
        rootNode.visited = true;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            node.visited = true;
            System.out.println(node.val);
            //add all unvisted nodes to stack
            if (node.right != null && !node.right.visited) {
                stack.push(node.right);
            }
            if (node.left != null && !node.left.visited) {
                stack.push(node.left);
            }
        }

    }


    private static class TreeNode {
        private int val;
        private TreeNode left, right;
        private boolean visited;

        private TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }

    }

}
