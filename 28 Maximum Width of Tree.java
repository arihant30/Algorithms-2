class Solution {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        int maxwidth=0;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int count=queue.size();
            maxwidth=Math.max(maxwidth,count);
            while(count-->0){
                Node temp=queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
        }
        return maxwidth;
    }
}
