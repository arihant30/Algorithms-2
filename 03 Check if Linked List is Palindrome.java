/* Structure of class Node is
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

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node slow=head;
        Node fast=head;
        
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

        }
        
        slow=reversed(slow);
        fast=head;
        
        while(slow!=null){
            if(slow.data!=fast.data){
                return false;
            }
            
            slow=slow.next;
            fast=fast.next;
            
        }
        
        return true;
        
    }
    public Node reversed(Node head){
        Node prev=null;
        while(head!=null){
            Node next_node=head.next;
            head.next=prev;
            prev=head;
            head=next_node;
                
        }
        return prev;
    }
}
