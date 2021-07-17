class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node node) 
    {
        ArrayList<Integer> outputarr=new ArrayList<>();
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node tempnode=queue.poll();
            outputarr.add(tempnode.data);
            if(tempnode.left!=null){
                queue.add(tempnode.left);
            }
            if(tempnode.right!=null){
                queue.add(tempnode.right);
            }
        }
        return outputarr;
    }
}
