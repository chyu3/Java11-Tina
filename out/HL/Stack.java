/*
 * Stack ADT - Linked implementation
 *
 */
 
public class Stack
{
	Node top;
	
	public boolean isEmpty()
	{
		if(top == null)
			return true;
		else
			return false;
		// or, in short: return top == null;
	}
	
	public void push(int d)
	{
		Node newNode = new Node();
		newNode.data = d;
		if( isEmpty() )
		{
			top = newNode;
		} else {
			newNode.next = top;
			top = newNode;
		}
	}
	
	public int pop()
	{
		if( !isEmpty() )
		{
			int d = top.data;
			top = top.next;
			return d;
		}
		return -1;
	}
	
	public int peek()
	{
		return top.data;
	}
	
	public void printStack()
	{
		Node temp = top;
		if(temp != null)
		{
			System.out.println("Top\n---");
		}
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}

