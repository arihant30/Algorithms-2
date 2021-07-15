class Solution
{
    //Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V,ArrayList<ArrayList<Integer>> adj)
    {
        boolean visited[]=new boolean[V];
        Queue<Integer> queue=new LinkedList<Integer>();
        ArrayList<Integer> outputarr=new ArrayList<>();
        visited[0]=true;
        queue.add(0);
        while(!queue.isEmpty()){
            int temp=queue.poll();
            outputarr.add(temp);
            for(int i:adj.get(temp)){
                if(!visited[i]){
                    visited[i]=true;
                    queue.add(i);
                }
            }
        }
        return outputarr;
    }
}
