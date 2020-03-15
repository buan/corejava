final class b1
{
	void m1()
	{
		System.out.println("hi");
	}
}

class c1 extends b1
{
	void m2()
	{
		System.out.println("hi");
	}
	
	public static void main(String args[])
	{
		c1 c=new c1();
		c.m1();
		c.m2();
	}
}