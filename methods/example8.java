class Emp{}
class X{}
class example8
{
	Emp m1()
	{
		System.out.println("m1 method");
		Emp e=new Emp();
		return e;
	}
	
	X m2()
	{
		System.out.println("m2 method");
		X x=new X();
		return x;
	}
	
	static String m3()
	{
		System.out.println("m3 method");
		return "hello";
	}
	
	public static void main(String args[])
	{
		example8 e=new example8();
		Emp e1=e.m1();
		System.out.println(e1);
		X x1=e.m2();
		System.out.println(x1);
		String str=example8.m3();
		System.out.println(str);
	}
}