package pWdh;

import java.util.*;


//
//Employee class is a subclass
public class Employee extends Person
{
	//这个字段在本包内的其他类中可以通过对象名访问，不安全
	String warningString;
	
	public Employee()
	{
		super("");
		age=1;
	}
	
	public Employee(double s)
	{
		this("test", s);
		nextId++;
	}
	
	public Employee(String n, double s) {
		this();
		//age=29;
		name=n;
		salary=s;
	}
	
	public Employee(String n, double s, int year, int month, int day) {

		this();
		name=n;
		//age=29;
		salary=s;		
		GregorianCalendar calendar=new GregorianCalendar(year,month-1,day);
		hireDay=calendar.getTime();
	}
	
	public String getName(){
		return name;
	}
	
	public void setEmployeeId(){
		EmployeeId=nextId;
		nextId++;
	}
	
	public void raiseSalary(double d){
		salary+=d;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public final String getTestFinal()
	{
		return "string";
	}

	private String name;
	private final int age;
	private double salary;
	private Date hireDay;
	
	private int EmployeeId;
	private static int nextId=1;
	
	public static final double PI=3.14;
	
	static int assignId()
	{
		int r=nextId;
		nextId++;
		return r;
	}
	
	private int id=assignId();
	
	public void CloseDispose()
	{
		//Runtime.getRuntime().addShutdownHook()
	}

	public String getDescription()
	{
		return "this is employee description";
	}
}