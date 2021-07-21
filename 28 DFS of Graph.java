class Solution
{
    //Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer> output=new ArrayList<>();
        boolean[] visited=new boolean[V];
        utilfunc(0,visited,output,adj);
        return output;
    }
    static void utilfunc(int node,boolean[] visited, ArrayList<Integer> output, ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        output.add(node);
        for(int i:adj.get(node)){
            if(visited[i]==false){
                utilfunc(i,visited,output,adj);
            }
        }
    }
}
