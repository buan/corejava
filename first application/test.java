/*step 1:select editorpreferably edit plus
step2:write the application

import java.lang.* or java.lang.System/String(second one is better)

classes with access specifier as public should be saved with that name.there should be one class with public.
if nothing is public we can give any name

100 classes 100 class files generated

javac checks syntax errors

jvm looks for the main function in the file

default package in java is java.lang package
14 JAVA PACKAGES

to perform basic operations ,we need java.lang packages everytime..so everytime importing will take time
so its automatically imported


multiple main classes are possible
*/
//import java.lang.System;
//import java.lang.String;

/*

source files allows to declare multiple classes
source files allows to declare one public class and an infinite non public classes
compiler generates class files
compiler executes .class files and not .java files
source file allows multiple main classes
it is possible to execute only one .class file


*/


class test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

class A
{
	public static void main(String[] args) 
	{
		System.out.println("In A");
	}
}

class B
{
public static void main(String[] args) 
	{
		System.out.println("In B");
	}
}
