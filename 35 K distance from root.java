class Tree
{
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> output=new ArrayList<>();
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          if(root==null || k<0) return null;
          if(k==0){
              output.add(root.data);
          }
          Kdistance(root.left,k-1);
          Kdistance(root.right,k-1);
          return output;
     }
}
