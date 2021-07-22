class Solution {
    /*you are required to complete this function */
    boolean hasPathSum(Node root, int S) 
    {
        boolean ans=false;
        int subsum=S-root.data;
        if(subsum == 0 && root.left == null && root.right == null)
            return(ans = true);
        if(root.left != null )
            ans=ans || hasPathSum(root.left,subsum);
        if(root.right != null)
            ans=ans || hasPathSum(root.right,subsum);
        return(ans);
    }
}
