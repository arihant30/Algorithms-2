class GfG
{
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        return utilfunc(root,root);
    }
    static boolean utilfunc(Node node1,Node node2){
        if(node1==null && node2==null)
            return true;
        if(node1!=null && node2!=null && node1.data==node2.data)
            return (utilfunc(node1.right,node2.left)&&utilfunc(node1.left,node2.right));
        return false;
    }
}
