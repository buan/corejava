class example6
{
	int x=100;
	int y=200;
	
	void add(int x,int y)
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}
	//to make use of an instance variable use this keyword.
	
	/*static void add(int x,int y)
	{
		System.out.println(x+y);
		System.out.println(this.x+this.y);
	}*/
	
	// inside static method this keyword declaration is invalid
	public static void main(String args[])
	{
		example6 e=new example6();
		e.add(10,20);
	}
}