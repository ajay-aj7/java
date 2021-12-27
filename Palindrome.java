class Palindrome
{
	public static void main(String[] args) 
	{
		int  num,number=121,rem,rev=0;
		num=number;
		while (num>0){
			rem=num%10;
		rev=rev*10+rem;
		num/=10;
         }
		System.out.println(rev);

		if (number==rev){
			System.out.println("palindrome");
		}
			else{
			
		
		System.out.println("not palindrome");
	}
}
}
