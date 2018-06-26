package Question11;

public class Child3 extends Father3
{

	public Child3(String a, int b)
	{
		//super(1);
		System.out.println("这是子类的构造函数");
	}

	public static void main(String[] args)
	{

		Child3 t3 = new Child3("xx", 1);

	}
}
