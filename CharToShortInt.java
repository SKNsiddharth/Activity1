class CharToShortInt
{
	public static void main (String [] args)
	{
	char c;
	short s;
	int i;
	
	c = 'A';
	i = (int)c;
	s = (short)c;
	
	System.out.println(c);//A
	System.out.println(i);//65
	System.out.println(s);//65
	
	}
}