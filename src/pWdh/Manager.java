package pWdh;

public class Manager extends Employee {

	public Manager()
	{
		//super(1);
	}

	
	public String getName()
	{
		return "this is manager";
	}
	
	/* 基类中此方法已经定义成final，因此这里不能再复写基类
	public String getTestFinal()
	{
		return "string";
	} 
	*/

}
