class z19
{
	static int i=10;
	static
	{
	System.out.println("z19.SIB");
	i=20;
	}
}
class z20
{
	static
		{
		System.out.println("z20.SIB");
		}
	public static void main (String[] args)
	{
		System.out.println("main begin");
		System.out.println("z19.i");
		System.out.println("--------");
		System.out.println("z19.i");
		System.out.println("--------");
		System.out.println("main end");
	}
}

