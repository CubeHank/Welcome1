package pWdh;

public abstract class Person {

	public abstract String getDescription();
	
	//抽象类可以包含具体数据和方法
	
	public Person(String n){}
	
	public String getName()
	{
		return name;
	}
	
	private String name;
}
