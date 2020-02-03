class Parent
{
	Parent()
	{
		System.out.println("In Parent 0 arg cons");
	}
}

class Child extends Parent
{
	
	public static void main(String args[])
	{
		new Child();
	}
	
}