class Tree
{
ArrayList<Integer> outputarr=new ArrayList<>();
    void nosibling(Node node){
        if(node==null){
            return;
        }
        if(node.left!=null && node.right!=null){
            nosibling(node.left);
            nosibling(node.right);
        }
        else if(node.left !=null){
            outputarr.add(node.left.data);
            nosibling(node.left);
        }
        else if(node.right!=null){
            outputarr.add(node.right.data);
            nosibling(node.right);
        }
    }
    ArrayList<Integer> noSibling(Node node)
    {

    nosibling(node);
    if(outputarr.isEmpty()){
        outputarr.add(-1);
    }
    Collections.sort(outputarr);
    return outputarr;
    }
}
