class z10
{
	static int i=test();
	static
{
	System.out.println("z10.test():" +i);
	return 69
}
	public static void main (String[] args)
	{
	System.out.println("z10.main begin:" +i);
	i=33;
	System.out.println("z9.test());
	System.out.println("z10.main end" +i);
	}
	}