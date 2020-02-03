class Emp
{
	int eid;
	String emp;
	float sal;
	
	Emp()
	{
		eid=111;
		emp="soumya";
		sal=100.98f;
	}
	void m1()
	{
		System.out.println(eid);
		System.out.println(emp);
		System.out.println(sal);
	}
	
	public static void main(String args[])
	{
		Emp e=new Emp();
		e.m1();
	}
	
}
