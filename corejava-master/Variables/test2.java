class test2
{
int a=10;
int b=20;

static int x=30;
static int y=40;

void m1()
	{
System.out.println(a);
System.out.println(b);
System.out.println(test2.x);
System.out.println(test2.y);
	}


	static void m2()
	{
test2 t=new test2();
System.out.println(t.a);
System.out.println(t.b);
System.out.println(test2.x);
System.out.println(test2.y);
	}


public static void main(String args[])
	{
test2 t=new test2();
t.m1();
test2.m2();
	}
}