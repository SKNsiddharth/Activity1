class Condition
{
	public static void main (String [] args)
	{
		int a = 80;
		char b = 'U';
		int c = a%5;
		System.out.print("Here the value of digit is :");
		System.out.println(a);
		
		System.out.print("Here the value of char is :");
		System.out.println(b);

		System.out.println("***********************************");
		
		
		System.out.println((a==0)?"Zero":"Non-Zero");
		System.out.println("-----------------------------------");
		
		System.out.println((a>=0)?"Positive":"Non-Positive");
		System.out.println("-----------------------------------");
		
		System.out.println((b>='A' && b<='Z')?"Upper Case":"Not Upper Case");
		System.out.println("-----------------------------------");
		
		System.out.println((b>=0 && b<=9)?"Digit":"Not a digit");
		System.out.println("-----------------------------------");
		
		System.out.println((b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||b=='A'||b=='E'||b=='I'||b=='O'||b=='U')?"it is a vowel":"Not a vowel");
		System.out.println("-----------------------------------");
		
		System.out.println((b>='a' && b<='z')?"Lower Case":"Not Lower Case Case");
		System.out.println("-----------------------------------");
		
		System.out.println((c==0)?"Divisible by 5":"Not divisible by 5");
		System.out.println("-----------------------------------");
		
		
		
		
	}
}