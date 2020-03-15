class example4
{
	m1()//instance method// always parameters are local
	{
	  System.out.println("in m1");
	  
	}

	
public static void main(String args[])	
{
 example4 e1=new example3();
 e1.m1();
}
}
// D:\ITEMS\project\java\methods>javac example4.java
  //example4.java:3: error: invalid method declaration; return type required
