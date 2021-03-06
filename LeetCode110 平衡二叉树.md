***description***<br>
给定一个二叉树，判断它是否是高度平衡的二叉树。
本题中，一棵高度平衡二叉树定义为：
一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。

示例 1:

>给定二叉树 [3,9,20,null,null,15,7]
>         3
>        / \
>       9  20
>         /  \
>        15   7
>返回 true 。

示例 2:

>给定二叉树 [1,2,2,3,3,null,null,4,4]
>         1
>        / \
>       2   2
>      / \
>     3   3
>        / \
>       4   4
>返回 false。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/balanced-binary-tree/

***MyCode***<br>
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)return true;
        if (height(root) == -1)return false;
        return true;
    }
    private int height(TreeNode root){
        if (root == null)return 0;
        int left = height(root.left)+1;
        int right = height(root.right)+1;
        if (left==0 || right==0)return -1;
        int diff = Math.abs(left - right);
        if (diff <= 1)return Math.max(left,right);
        return -1;
    }
}