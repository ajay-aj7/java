class Static1 
{
	static boolean b=true;
	public static void main(String[] args) 
	{
		boolean b=false;
		Static1.b=b;
		System.out.println(b);
		System.out.println(Static1.b);
		System.out.println(Static1.s);


	}
	static String s;
}
