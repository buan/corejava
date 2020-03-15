class example7
{
		int m1()
		{
			System.out.println("m1 method");
			return 10;
		}
		
		float m2()
		{
			System.out.println("m2 method");
			return 10.9f;
		}
		
		static char m3()
		{
			System.out.println("m3 method");
			return 'a';
		}
		
		
		public static void main(String args[])
		{
			example7 e1=new example7();
			int a=e1.m1();
			System.out.println("Return value of m1 is "+a);
			float f=e1.m2();
			System.out.println("Return value of m2 is "+f);
			char c=example7.m3();
			System.out.println("Return value of m3 is "+c);
		}
}
