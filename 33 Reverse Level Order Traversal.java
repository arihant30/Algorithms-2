class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> output=new ArrayList<>();
        Stack<Node> stack=new Stack<Node>();
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node temp=queue.poll();
            stack.push(temp);
            if(temp.right!=null){
                queue.add(temp.right);
            }
            if(temp.left!=null){
                queue.add(temp.left);
            }
            
        }
        while(!stack.isEmpty()){
            Node temp1=stack.pop();
            output.add(temp1.data);
        }
        return output;
    }
}  
