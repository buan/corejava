class static1
{

static int a=1000;
static int b=2000;

public static void main (String args[])
	{
	
	System.out.println(static1.a);
	System.out.println(static1.b);

	static1 t=new static1();
	t.m1();
	}

	void m1()
	{
	
	System.out.println(static1.a);
	System.out.println(static1.b);
	}
}