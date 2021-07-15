//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> outputarr=new ArrayList<>();
    static int maxlevel=0;

    ArrayList<Integer> leftView(Node root)
    {
        utilfunc(root,1);
        return outputarr;
    }
    void utilfunc(Node node, int level){
        if(node==null)
            return;
        if(maxlevel<level){
            outputarr.add(node.data);
            maxlevel=level;
        }
        utilfunc(node.left,level+1);
        utilfunc(node.right,level+1);
    }
}
