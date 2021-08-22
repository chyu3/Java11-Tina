//
// ADT: queue -- FIFO
// enqueue, dequeue, isEmpty, printQueue
//
public class Queue
{
	Node head;
	Node tail;
	int  size;
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void enQueue(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if( isEmpty() )
		{
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public int deQueue()
	{	if( !isEmpty() )
		{	int data = head.data;
			head = head.next;
			size--;
			return data;
		} else {
			System.out.println("Error-Empty queue");
			return 0;
		}
	}
	
	public void printQueue()
	{	
		if(isEmpty())
		{	System.out.println("Queue is empty");
			return;
		}
		Node temp = head;
		System.out.print("Head <- ");
		while(temp != null)
		{	System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println(" <- Tail");
	}
			
	
}

