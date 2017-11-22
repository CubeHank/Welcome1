import java.io.Console;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import pWdh.*;

public class Welcome1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("hello java 1,eclipse.");
		
		//EmployeeTest.TestPrint(null);
		//Test3();
		//Test4();
		//Test5();
		Test6();
	}
	
	public static void Test1()
	{
		/*
		System.out.println("what is your name?");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.println("name:"+name);
		
		System.out.println("enter username:");
		Console cons=System.console();//注意由于eclipse的原因，这里不能正常执行，但此代码在java cmd中可以编译并运行通过
		String userName=cons.readLine("userName:");
		System.out.println("userName:"+userName);
		
		System.out.println("enter password:");
		char[] passwd=cons.readPassword();
		System.out.println("pwd:"+passwd.toString());
		*/
		
		double x=1000.0/3.0;
		System.out.print(x);
		System.out.printf("%8.2f\n",x);
		String message=String.format("Hello,%s,next year %d","wangdonghao",2018);
		System.out.println(message);
		System.out.printf("%tF",new Date());
		
		System.out.println("java special for");
		int[] a=new int[2];
		int i=0;
		for(int e:a)
		{
			e=i;
		}
		System.out.println(Arrays.toString(a));
		for(int p:a)
			System.out.println(p);
		
		int[] arrayTest1={1,3,5};
		System.out.println(Arrays.toString(arrayTest1));
		int[] arrayTest2=new int[]{2,4,6};
		System.out.println(Arrays.toString(arrayTest2));
		arrayTest1[0]=99;
		int[] arrayTest3=arrayTest1;//浅表拷贝
		System.out.println(Arrays.toString(arrayTest3));
		
		//深度拷贝
		int[] arrayTest4=Arrays.copyOf(arrayTest2, arrayTest2.length);
		arrayTest2[2]=100;
		System.out.println("array2:"+Arrays.toString(arrayTest2));
		System.out.println("array4:"+Arrays.toString(arrayTest4));
		
		
	}

	public static void Test2()
	{
		//System.out.println(args[0]);
				//System.out.println(args[1]);
				//System.out.println(args[2]);
				int[] sort1={3,2,7};
				System.out.println(Arrays.toString(sort1));
				Arrays.sort(sort1);
				System.out.println(Arrays.toString(sort1));
				
				int[][] TwoWeArray={{00,01},{10,11},{20,21}};
				System.out.println(Arrays.deepToString(TwoWeArray));
	}

	public static void Test3()
	{
		System.out.println("Test tripleValue:");
		double percent=10;
		System.out.println("before percent="+percent);
		tripleValue(percent);
		System.out.println("after percent="+percent);
	}
	
	public static void tripleValue(double x){
		x=3*x;
		System.out.println("End of method:x="+x);
	}
	
	public static void Test4()
	{
		System.out.println("Test tripleSalary:");
		Employee aEmployee=new Employee("aa", 50);
		System.out.println("before salary="+aEmployee.getSalary());
		tripleSalary(aEmployee);
		System.out.println("after salary="+aEmployee.getSalary());
	}
	
	public static void tripleSalary(Employee x){
		x.raiseSalary(200);
		System.out.println("End of method:x.salary="+x.getSalary());
	}

	public static void Test5()
	{
		System.out.println("Test swap:");
		Employee aEmployee=new Employee("aa", 50);
		Employee bEmployee=new Employee("bb", 1);
		System.out.println("before a="+aEmployee.getName());
		System.out.println("before b="+bEmployee.getName());
		SwapObj(aEmployee,bEmployee);
		System.out.println("after a="+aEmployee.getName());
		System.out.println("after b="+bEmployee.getName());
	}
	
	public static void SwapObj(Employee x,Employee y){	
		Employee tEmployee=x;
		x=y;
		y=tEmployee;
		System.out.println("End of method:x="+x.getName());
		System.out.println("End of method:x="+y.getName());
	}


	public static void Test6()
	{
		EmployeeTest employeeTest=new EmployeeTest();
		employeeTest.TestPrint(null);
	}
	
}
