public class Solution
{
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
       Node l=null;
       Node r=null;
       return nodecheck(root,l,r);
    }
    boolean nodecheck(Node node, Node min, Node max){
        if(node==null)
            return true;
        if(min!=null && node.data<=min.data)
            return false;
        if(max!=null && node.data>=max.data)
            return false;
        else{
            return nodecheck(node.left,min,node)&&nodecheck(node.right,node,max);
        }
    }
    
}
