/*
给定一个二叉树，判断其是否是一个有效的二叉搜索树。

假设一个二叉搜索树具有如下特征：

节点的左子树只包含小于当前节点的数。
节点的右子树只包含大于当前节点的数。
所有左子树和右子树自身必须也是二叉搜索树

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/validate-binary-search-tree
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
**/

class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
     TreeNode(int x) { val = x;left=null;right=null; }
 }
public class Solution {
    public  boolean isValidBST(TreeNode root) {
        help(root,null,null);
    }
    private boolean help(TreeNode node,Integer lower,Integer upper){
        if(node==null)return true;
        int val = node.val;
        if(lower!=null&&val<=lower)return false;
        if(upper!=null&&val>=upper)return false;
        if(!help(node.right,val,upper))return false;
        if(!help(node.left,lower,val))return false;
        return true;
    }

}
