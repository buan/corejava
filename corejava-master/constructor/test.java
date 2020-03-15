class test
{
	test(int a)
	{
		System.out.println("1 arg cons");
	}
	public static void main(String args[])
	{
		test t=new test();
		test t1=new test(10);
		t.m1();
		t1.m1();
	}
}