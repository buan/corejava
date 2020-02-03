class Emp1
{
int eid;
String emp;
float sal;

Emp1(int eid,String emp,float sal)//conversion of local values to instance values
{
this.eid=eid;
this.emp=emp;
this.sal=sal;
}

void disp()
{
System.out.println(eid);
System.out.println(emp);
System.out.println(sal);

}

public static void main(String args[])
{
Emp1 e=new Emp1(10,"sss",12f);
e.disp();
}
}