class z14
{
	static int i=test();
	public static int test()
	{
		System.out.println("test:" +i);
		i=99;
		main (null);
		return 10;
	}
	public static void main (String[] args)
	{
		System.out.println("main begin:" +i);
		i=33;
		System.out.println("main end:" +i);
	}
}