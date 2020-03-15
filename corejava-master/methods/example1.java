class example1
{
	void m1()//instance method
	{
	  System.out.println("in m1");
	}

	static void m2()//static method
	{
	  System.out.println("in m2");
	}

public static void main(String args[])	
{
 example1 e1=new example1();
 e1.m1();
 example1.m2();
}
}
