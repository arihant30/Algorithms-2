class Tree
{
    
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	    int leftheight;
	    int rightheight;
	    if(root==null){
	        return true;
	    }
	    leftheight=height(root.left);
	    rightheight=height(root.right);
	    if(Math.abs(leftheight-rightheight)<=1 && isBalanced(root.left) && isBalanced(root.right)){
	        return true;
	    }
	    return false;
    }
    int height(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.right),height(node.left));
    }
}
