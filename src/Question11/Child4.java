package Question11;

public class Child4 extends Father4
{

	public Child4()
	{
		super("a");
		System.out.println("这是子类的构造函数调用2");
	}

	public Child4(String a, int b)
	{
		super(1);
		System.out.println("这是子类的构造函数调用1");
	}

	public static void main(String[] args)
	{

		Child4 t3 = new Child4("xx", 1);
		Child4 t4 = new Child4();

	}
}
