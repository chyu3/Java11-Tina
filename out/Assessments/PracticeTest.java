


public class PracticeTest
{
	public static void main (String[] args)
	{
		int n2 = 1;
		while (n2 !=0)
		{
			IBIO.output("Tina");
			int n1 = IBIO.inputInt("Input base: ");
			 n2 = IBIO.inputInt("Exponent: ");
			if (n1 == 0)
			{
				System.out.println("Base = zero. Nothing to do.");
				System.exit(0);
			}
			if (n2 < 0)
			{
				System.out.println("Warning = exponent should be positive");
				//System.exit(0); For Q 5 
			}
			int ans = n1;
			if (n2 > 0)
			{
				for (int i = 1 ; i < n2 ; i++)
				{
				   ans = ans * n1;
			    }
			    System.out.println(n1 + "to the power of" + n2 + "=" + ans);
			}
			if (n2 < 0)
			{
				for (int i = n2+1 ; i < 0 ; i++)
				{
					ans = ans * n1;
				}
				System.out.println(n1 + "to the power of" + n2 + "= 1/" + ans);
				double decans = 1.0 / ans;
				System.out.println("  1");
				System.out.println("---- =" + decans);
				System.out.println(" " + n1 + "^" + n2*-1);
			}
			System.out.println("Program ended");
		}	
	}
}

