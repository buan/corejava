class StaticAndInstance
{
	int a=20;
	static int b=30;
	public static void main(String args[])
	{
	StaticAndInstance t1=new StaticAndInstance();
	System.out.println(t1.a);
	System.out.println(t1.b);
	t1.a=999;
	t1.b=888;
	System.out.println(t1.a);
	System.out.println(t1.b);

	StaticAndInstance t2=new StaticAndInstance();
	System.out.println(t2.a);
	System.out.println(t2.b);

	t2.b=777;

	StaticAndInstance t3=new StaticAndInstance();
	System.out.println(t3.a);
	System.out.println(t3.b);//static variables, the values are replaced as they share single copy
	}
	
}