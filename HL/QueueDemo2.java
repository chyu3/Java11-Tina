
public class QueueDemo2
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println( i + " : " + a[i] );
		}
		System.out.println();
	}
	
	public static void main (String[] args)
	{
		int[] intArray = { 1,2,3,4,5,6,7,8,9 };
		Queue q = new Queue();
		// copy the array 'intArray' into the queue 'q'
		// display the resulting queue
		for (int i = 0; i < intArray.length; i++)
		{
			q.enQueue(intArray[i]);
		}
		q.printQueue();
		
		int queueLength = 0;
		Node temp = q.head;
		while (temp != null)
		{
			queueLength++;
			temp = temp.next;
		}
		
		int[] newArray = new int[queueLength];
		int i = 0;
		while(q.isEmpty() == false)
		{	newArray[i] = q.deQueue();
			i++;
		}
		
		q.printQueue();
		printArray(intArray);
	}
}

