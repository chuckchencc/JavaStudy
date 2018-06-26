package Question11;

public class Child1 extends Father1
{
	public Child1(String a, int b)
	{

		System.out.println("这是子类的构造函数");
	}

	public static void main(String[] args)
	{

		Child1 t3 = new Child1("xx", 1);

	}
}
