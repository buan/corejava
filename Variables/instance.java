class instance
{

int a=300;
int b=200;

public static void main(String args[])
	{
	// static area
	instance i=new instance();
	System.out.println(i.a);
	System.out.println(i.b);
	i.m1();
	}
void m1()
	{
	// instance area
		System.out.println(a);
		System.out.println(b);
	}

}