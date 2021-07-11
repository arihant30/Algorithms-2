class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	Node next=head.next;
	Node current=head;
	while(next!=null){
	    if(current.data==next.data){
	        current.next=next.next;
	        next=current.next;
	    }
	    else{
	        current=next;
	        next=next.next;
	    }
	}
	return head;
    }
}
