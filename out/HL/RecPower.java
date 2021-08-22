public class RecPower
{
	static int power(int base, int expo)
	{
		if(base == 1)
		{	return 1;
		} else if( expo == 0 )
		{	return 1;
		} else if( expo == 1)
		{	return base;
		} else {
			return base * power(base, expo-1);
		}
	}
	
	static double superPower(int base, int expo)
	{
		if(base == 1)
		{	return 1;
		} else if( expo == 0 )
		{	return 1;
		} else if( expo == 1)
		{	return base;
		} else if( expo < 0)
		{	return 1.0 / power(base, expo * -1);
		} else {
			return base * power(base, expo-1);
		}
	}
	
	static int mult(int number, int times)
	{
		if(times > 0)
		{	return number + mult(number, times-1);
		} else {
			return 0;
		}
	}
	
	static int tri(int number)
	{
		if(number > 0)
		{	return number + tri(number-1);
		} else {
			return 0;
		}
	}
	
	static void dec2bin(int number)
	{
		if(number == 0)
		{	return;
		} else if(number > 0)
		{
			dec2bin(number/2);
			System.out.print(number % 2);
		}
	}
	
	public static void main (String[] args)
	{
		System.out.println( power(2, 10) );
		System.out.println( power(0, 0) );
		System.out.println( power(1, 100) );
		System.out.println( power(99, 1) );
		System.out.println( superPower(2, -4) );
		System.out.println( mult(2, 4) );
		dec2bin(12);
		System.out.println( "\n" + tri(5) );
	}
}

