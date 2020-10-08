/*
 * examples with the FOR loop in Java
 * repeats a code block depending on a counter (usually i)
 * 
 */
 
public class ForExample
{
	
	public static void main (String[] args)
	{
		String name = "Bond, James Bond";
		int times = IBIO.inputInt("How many times? ");
		for(int i = 0; i < times; i++)
		{
			IBIO.output(name);
		}
		IBIO.output("\n\nCounting from 1 to " + times);
		for(int i = 1; i <= times; i++)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\n\nCounting from 1 to " + times + " in twos");
		for(int i = 1; i <= times; i=i+2)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\n\nIt's the final countdown!");
		for(int i = times; i > 0; i--)
		{
			IBIO.out(i + " ");
		}
		IBIO.output("\n\nLet's count in hexa!");
		for(int h = 0; h < 16; h++)
		{
			if(h < 10)
			{
				IBIO.out(h + " ");
			}
			if(h == 10)
			{
				IBIO.out("A ");
			}
			if(h == 11)
			{
				IBIO.out("B ");
			}
			if(h == 12)
			{
				IBIO.out("C ");
			}
			if(h == 13)
			{
				IBIO.out("D ");
			}
			if(h == 14)
			{
				IBIO.out("E ");
			}
			if(h == 15)
			{
				IBIO.out("F ");
			}
		}
	}
}

