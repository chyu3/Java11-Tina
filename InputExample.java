/*
 * Example to input an integer (with a prompt)
 * 
 */
public class InputExample
{
	
	public static void main (String[] args)
	{
		IBIO.output("===========");
		String name = IBIO.input("What is your name? ");
		IBIO.output("Nice to meet you, " + name);
		int age = IBIO.inputInt("How old are you? ");
		IBIO.output("So you are " + age + " years old.");
		if( age > 17 )
		{
			IBIO.output("You are OLD, " + name);
			IBIO.output("At least you're not dead.");
		}
		//String agesString = "" + age; // convert an int to String
		/* this does the same as the line above
		IBIO.out("So you are ");
		IBIO.out(age);
		IBIO.output(" years old.");
		*/
		//System.out.printf("So you are %,d years old.\n", age);
	}
}

/*

How old are you? 17
So you are 17 years old.

*/
