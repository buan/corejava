class example5
{
	void m1()//instance method// always parameters are local
	{
	  System.out.println("in m1");
	  void m2()
	  {
		  
	  }
	}

	
public static void main(String args[])	
{
 example5 e1=new example3();
 e1.m1();
}
}
/*
example5.java:6: error: illegal start of expression
          void m2()
          ^
example5.java:6: error: ';' expected
          void m2()
                 ^
2 errors*/