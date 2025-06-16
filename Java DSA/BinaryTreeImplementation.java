import java.util.ArrayList;
import java.util.HashMap;

class Node {
    int val;
    Node left, right;

    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    private Node root = null;
    private HashMap<Integer, ArrayList<Integer>> levelMap;

    void insert(int val){
        root = insertValue(root, val);
    }

    private Node insertValue(Node current, int val) {
        if(current == null)
            current = new Node(val);
        else {
            if(val < current.val)
                current.left = insertValue(current.left, val);
            else
                current.right = insertValue(current.right, val);
        }
        return current;
    }

    void inOrder() {
        inOrderTraversal(root);
    }

    void preOrder() {
        preOrderTraversal(root);
    }

    void postOrder() {
        postOrderTraversal(root);
    }

    private void inOrderTraversal(Node node) {
        if(node != null){
            inOrderTraversal(node.left);
            System.out.print(node.val + " - ");
            inOrderTraversal(node.right);
        }
    }

    private void preOrderTraversal(Node node) {
        if(node != null){
            System.out.print(node.val + " - ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    private void postOrderTraversal(Node node) {
        if(node != null){
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.val + " - ");
        }
    }

    boolean search(int val) {
        return searchTree(root, val);
    }

    int height() {
        return treeHeight(root);
    }

    int treeHeight(Node node) {
        if(node==null)
            return -1;

        int left = treeHeight(node.left);
        int right = treeHeight(node.right);

        return 1 + Math.max(left, right);
    }

    boolean pathTarget(int target) {
        return hasPathSum(root, target);
    }

    private boolean hasPathSum(Node node, int target) {
        if(node == null)
            return false; 
        
        System.out.println("node val: " + node.val + "  target: " + target);

        if(node.left== null && node.right == null && node.val == target)
            return true;

        return hasPathSum(node.left, target - node.val) || hasPathSum(node.right, target - node.val);
    }

    private boolean searchTree(Node node, int val) {
        if(node == null)
            return false;
        if(node.val == val)
            return true;
        return val < node.val ? searchTree(node.left, val) : searchTree(node.right, val);
    }

    HashMap<Integer, ArrayList<Integer>> levelMap() {
        levelMap = new HashMap<>();

        levelMapTraversal(root, 0);
        return levelMap;
    }

    private void levelMapTraversal(Node root, int level) {

        if(root == null)
            return;
        levelMap.computeIfAbsent(level, v -> new ArrayList<>()).add(root.val);

        levelMapTraversal(root.left, ++level);
        levelMapTraversal(root.right, ++level);
    }


}

public class BinaryTreeImplementation {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(3);
        tree.insert(1);
        tree.insert(20);
        tree.insert(15);
        tree.insert(25);

        // for(int i = 1; i < 6; i++) {
        //     if(i!=3)
        //     tree.insert(i);
        // }

        // tree.preOrder();
        // System.out.println();
        // System.out.println(tree.height());
        
        // System.out.println(tree.pathTarget(12));

        System.out.println(tree.levelMap());

    }

}
