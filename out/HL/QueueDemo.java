/*
 * Queue Demo v1
 * 
 */


public class QueueDemo
{
	
	public static void main (String[] args)
	{
		Queue numberQueue = new Queue();
		int input;
		do
		{
			input = IBIO.inputInt("Enter a number to enqueue: ");
			if(input > 0)
			{	numberQueue.enQueue(input);
			}
			numberQueue.printQueue();
		} while(input > 0);
		
		System.out.println("\nNow we dequeue the whole q:");
		while(numberQueue.isEmpty() == false)
		{	System.out.print( numberQueue.deQueue() + " " );
		}
		System.out.print( numberQueue.deQueue() + " " ); // to cause error, q empty
	}
}

