class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        Stack<Node> stack=new Stack<Node>();
        Stack<Node> stack2=new Stack<Node>();
        ArrayList<Integer> outputarr=new ArrayList<>();
        if(root==null){
            return outputarr;
        }
        stack.push(root);
        while(!stack.isEmpty()||!stack2.isEmpty()){
            while(!stack.isEmpty()){
                Node temp=stack.pop();
                outputarr.add(temp.data);
                if(temp.right!=null){
                    stack2.push(temp.right);
                }
                if(temp.left!=null){
                    stack2.push(temp.left);
                }
            }
            while(!stack2.isEmpty()){
                Node temp=stack2.pop();
                outputarr.add(temp.data);
                if(temp.left!=null){
                    stack.push(temp.left);
                }
                if(temp.right!=null){
                    stack.push(temp.right);
                }
            }
        }
        return outputarr;
    }
}
