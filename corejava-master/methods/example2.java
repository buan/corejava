class example2
{
	void m1(int a,char ch)//instance method// always parameters are local
	{
	  System.out.println("in m1");
	  System.out.println(a);
	  System.out.println(ch);
	}

	static void m2(String str,double d)//static method
	{
	  System.out.println("in m2");
	  System.out.println(str);
	  System.out.println(d);
	}

public static void main(String args[])	
{
 example2 e1=new example2();
 e1.m1(12,'x');
 example2.m2("test",5.55);
}
}
