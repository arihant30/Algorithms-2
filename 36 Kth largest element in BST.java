class Solution
{
    // return the Kth largest element in the given BST rooted at 'root'
    public int kthLargest(Node root,int K)
    {
        int[] nums=new int[2];
        revinorder(root,K,nums);
        return nums[1];
    }
    void revinorder(Node root,int K,int[] nums){
        if(root==null){
            return;
        }
        revinorder(root.right,K,nums);
        if(++nums[0]==K){
            nums[1]=root.data;
            return;
        }
        revinorder(root.left,K,nums);
    }
}
