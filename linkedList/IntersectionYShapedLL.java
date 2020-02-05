class Intersect
{
	int intersectPoint(Node headA, Node headB)
	{
	    
        Node temp=headA;
        Node temp1=headB;
        int x=0;
        while(temp!=null && temp1!=null)
        {
            if(temp.data==temp1.data)
            {
                x=1;
                break;
            }
            temp=temp.next;
            temp1=temp1.next;
            
        }
        if(x==1)
        return temp.data;
        else
        return -1;
	}
}