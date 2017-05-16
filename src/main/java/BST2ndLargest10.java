/**
 * Created by Marcin Gumkowski on 2016-12-04.
 */
public class BST2ndLargest10 {
    public static void main(String[] args) {
        BinaryTreeNode head = new BinaryTreeNode(5);
        head.insertRight(2).insertLeft(3).insertLeft(4);
        System.out.println(findSecondLargest(head));
        int[] array = {5, 6, 3, 1, 2, 4};
        bstDistance(array, 6, 2, 4);

    }

    public static int bstDistance(int[] values, int n,
                                  int node1, int node2) {

        BinarySearchTree tree = new BinarySearchTree();


        boolean has1 = false;
        boolean has2 = false;
        for (int i = 0; i < values.length; i++) {
            tree.add(values[i]);
            if (values[i] == node1) has1 = true;
            if (values[i] == node2) has2 = true;
        }
        if (has1 && has2)
            return tree.distance(tree.root, node1, node2);
        else return -1;
    }


    public static int findSecondLargest(BinaryTreeNode head) {
        if (head == null) {
            return -1; // or throw error;
        }
        if (head.right == null && head.left == null) {
            return -1; // or throw error;
        }
        BinaryTreeNode temp = head;
        BinaryTreeNode previous = null;

        while (temp.left != null) {
            previous = temp;
            temp = temp.left;
        }
        if (previous == null || temp.right != null) {
            previous = temp;
        }

        if (previous.right != null) {
            temp = previous.right;
            if (temp.left == null) {
                return temp.value;
            }
            while (temp.left != null) {
                temp = temp.left;
            }
            return temp.value;


        } else {
            return previous.value;
        }

    }

    public static class BinarySearchTree {

        BinaryTreeNode root = null;


        public int distance(BinaryTreeNode root, int node1, int node2) {
            if (root == null || node1 == node2)
                return 0;
            if (root.value >= node1 && root.value <= node2)
                return distance(root, node1) + distance(root, node2);
            else if (root.value < node1 && root.value < node2)
                return distance(root.right, node1, node2);
            else {
                return distance(root.left, node1, node2);
            }
        }

        public int distance(BinaryTreeNode root, int node1) {
            if (root.value == node1)
                return 0;
            if (root.value < node1) {
                return 1 + distance(root.right, node1);
            } else {
                return 1 + distance(root.left, node1);
            }
        }


        public boolean add(int value) {
            if (root == null) {
                root = new BinaryTreeNode(value);
                return true;
            } else
                return root.add(value);
        }
    }


    public static class BinaryTreeNode {

        public int value;
        public BinaryTreeNode left;
        public BinaryTreeNode right;

        public BinaryTreeNode(int value) {
            this.value = value;
        }

        public BinaryTreeNode insertLeft(int leftValue) {
            this.left = new BinaryTreeNode(leftValue);
            return this.left;
        }

        public BinaryTreeNode insertRight(int rightValue) {
            this.right = new BinaryTreeNode(rightValue);
            return this.right;
        }

        public boolean add(int value) {
            if (value == this.value)
                return false;
            else if (value < this.value) {
                if (left == null) {
                    left = new BinaryTreeNode(value);
                    return true;
                } else
                    return left.add(value);
            } else if (value > this.value) {
                if (right == null) {
                    right = new BinaryTreeNode(value);
                    return true;
                } else
                    return right.add(value);
            }
            return false;
        }

    }
}
