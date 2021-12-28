class  StrongNumber
{
	public static void main(String[] args) 
	{
		int num=145,sum=0,rem,n=num;
		while (num>0)
		{
			rem=num%10;
			sum=sum+factorial(rem);
			num/=10;
		}
		if (sum==n)
		{
			System.out.println("strong num");
		}
			else{
		System.out.println("not strong num");
	}
	}
	public static int factorial(int num)
		{
		int fact=1;
	for (int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	return fact;
}
	}

   

