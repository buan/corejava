class test1
{
	int a=2000;
	int b=1000;

	static void m1()
	{
	test1 t=new test1();
	System.out.println(t.a);
	System.out.println(t.b);
	}
//for the next method,we will create new object as after the method ends,the object is destroyed
	static void m2()
	{
	test1 t=new test1();
	System.out.println(t.a);
	System.out.println(t.b);
	}

	public static void main(String args[])
	{
test1.m1();
test1.m2();
	}

}