class Solution{
    public void toSumTree(Node root){
        if(root==null)
            return;
        root.data=(root.left==null? 0:root.left.data)+(root.right==null? 0:root.right.data);
        toSumTree(root.left);
        toSumTree(root.right);
        root.data+=(root.data==null?0:root.left.data)+(root.right==null?0:root.right.data);
    
    }
}
