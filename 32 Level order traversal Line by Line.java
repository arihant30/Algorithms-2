class Level_Order_Traverse
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        ArrayList<ArrayList<Integer>> outputarr=new ArrayList<>();
        if(node==null)
            return null;
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            ArrayList<Integer> level=new ArrayList<>();
            int nodecount=queue.size();
            while(nodecount>0){
                Node temp=queue.poll();
                level.add(temp.data);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
                nodecount--;
            }
            outputarr.add(level);
        }
        return outputarr;
    }
}
