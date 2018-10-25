class z17
{
	static int i;
	static
	{
	System.out.println("z17 SIB");
	}
}
class z18
{
	static
		{
		System.out.println("z18.SIB");
		}
	public static void main (String[] args)
	{
		System.out.println("main begin");
		System.out.println("z17.i");
		System.out.println("main end");
	}
}

