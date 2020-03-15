class X{}
class Y{}
class Emp{}
class Student{}

class example3
{
	void m1(X x1,Y y1)//instance method// always parameters are local
	{
	  System.out.println("in m1");
	}

	static void m2(Student s1,Emp e1)//static method
	{
	  System.out.println("in m2");
	}

public static void main(String args[])	
{
X x1=new X();
Y y1=new Y();
Emp e1=new Emp();
Student s1=new Student();


example3 e3=new example3();
e3.m1(x1,y1);//new X(),new Y()
example3.m2(s1,e1);//new Emp(),new Student()


}
}
