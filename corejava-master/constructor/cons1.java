class cons1
{
	cons1()
	{   this(10);//calling 1 arg cons
		System.out.println("0 arg cons");
	}
	
	cons1( int a)
	{	this(10,20);//calling 1 arg cons
		System.out.println("1 arg cons");
	}
	
	cons1(int a, int b)
	{
		System.out.println("2 arg cons");
	}
	
	public static void main(String args[])
	{
		//named approach
		cons1 c1=new cons1();
		//nameless approach
		new cons1();
	}
}