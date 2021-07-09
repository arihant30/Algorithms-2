/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class GfG
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
        Node p=head;
        Node f=head;
        for(int i=1;i<n;i++){
            f=f.next;
            if(f==null){
                return -1;
            }
        }
        while(f.next!=null){
            p=p.next;
            f=f.next;
        }
        return p.data;
    }
}
