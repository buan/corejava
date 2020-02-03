class test
{
	public static void main(String args[])
	{
	float f1=1.3f;
	double f2=9.4;
	System.out.println(f1);
	System.out.println(f2);
	}
}

/*test.java:5: error: possible loss of precision
        float f1=1.3;
                 ^
  required: float
  found:    double
1 error


to represent float value use 'f'

f1=1.3f

by default decimal values are double, so we need to convert it to float
*/