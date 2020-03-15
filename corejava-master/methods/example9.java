class example9
{
	example9 m1()
	{
		System.out.println("m1");
		example9 e=new example9();
		return e;
	}
	
	
	example9 m2()
	{
		System.out.println("m2");
		return this;
	}
	
	example9 m3()
	{
		System.out.println("m3");
		return new example9();
	}
	
	public static void main(String args[])
	{
		example9 e=new example9();
		example9 e1=e.m1();
		example9 e2=e.m2();
		example9 e3=e.m3();
		
	}
}