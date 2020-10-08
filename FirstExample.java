/*
 * FirstExample.java
 * Example of different ways of outputting data to the screen
 * (especially String literals (text between " ")
 * 
 * Note:
 * IBIO <- we use this to abbreviate some longer
 * Java expressions/methods
 */
 
public class FirstExample
{
	/*	special characters:
		\n = new line
		\t = tab (usually 4 spaces)
	*/
	public static void main (String[] args)
	{
		// output example (display data to the screen)
		// anything between " " goes literally to the screen
		// data between " " is called String
		IBIO.output("");
		IBIO.output("Hello");
		IBIO.output("Grade 11s!");
		IBIO.out("What ");
		IBIO.out("is your name");
		IBIO.out("?");
		IBIO.output("\tI'm Alan!\n");
		IBIO.output("\"Thanks!\"");
	}
}
/* OUTPUT

Hello
Grade 11s!
What is your name?	I'm Alan!

"Thanks!"

*/
