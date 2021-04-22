/*
 * Use this class to test your LinkedList class assignment
 * 
 */
 
//import java.util.LinkedList;
 
public class LListDemo
{
	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public Node head = null;
	public Node tail = null;

	public void Start(int data)
	{
		Node newNode = new Node(data);
		
		if (head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			Node temp = head;
			head = newNode;
			head.next = temp;
		}
	}
	
	public void printList()
	{
		Node current = head;
		if (head == null)
		return;
		
		System.out.println("To the start of list: ");
		while (current!= null)
		{
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	public void remove()
	{
		
	}
	
	
	public static void main (String[] args)
	{
		LinkedList l = new LinkedList();
		int[] array = {1,3,5,7,9,1,6,4,2,0};
		for(int x : array)
		{
			l.append(x);
			l.printList();
		}
		l.remove(1); l.printList();
		l.remove(9); l.printList();
		l.remove(0); l.printList();
	}
}

