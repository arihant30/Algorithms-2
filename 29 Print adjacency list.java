class Solution
{
    //Function to return the adjacency list for each vertex.
    public ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        for(int i=0;i<V;i++){
            adj.get(i).add(0,i);
        }
        return adj;
    }
}
