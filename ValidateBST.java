package week3;

public class ValidateBST {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        TreeNode prev;
        boolean isValid = true;

    public boolean isValidBST(TreeNode root) {
        helper(root);
        return isValid;
    }

    private void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        if(prev!=null && prev.val > root.val) {
            isValid = false;
        }
        prev = root;
        helper(root.right);
    }

}
