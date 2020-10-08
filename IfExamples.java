
public class IfExamples
{
	
	public static void main (String[] args)
	{
		int number = IBIO.inputInt("Enter a number: ");
		if(number != 666 && number > 0)
		{
			IBIO.output("Holy numbers, Batman!");
		}
		if(number == 666 || number < 0)
		{
			IBIO.output("Wicked.");
		}
		if(number < 0)
		{
			IBIO.output("Don't be so negative.");
		}
		if(number > 0)
		{
			IBIO.output("Looking positive today");
		}
		IBIO.output("The END");
	}
}

