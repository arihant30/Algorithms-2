/* Linklist node structure
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node temp=head;
        int i=1;
        if (x==1){
            return head=head.next;
        }
        while(i<x-1){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }
}
