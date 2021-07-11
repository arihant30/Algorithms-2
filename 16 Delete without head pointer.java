class Solution
{
    void deleteNode(Node del)
    {
         Node next=del.next;
         del.data=next.data;
         del.next=next.next;
         
    }
}
