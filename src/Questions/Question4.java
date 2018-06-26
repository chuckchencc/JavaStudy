package Questions;

public class Question4
{
	// 给定一个数a, 如果为奇数则输出“为奇数" 。如果是偶数则输出“为偶数”
	//
	// int a = 123;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Question2 Q2 = new Question2();
		// if (Q2.a % 2 == 1)
		// {
		// System.out.printf(Q2.a + "为奇数");
		//
		// } else if (Q2.a % 3 == 0 && Q2.a % 7 == 0)
		// {
		// System.out.println("true");
		// } else
		// {
		// System.out.printf(Q2.a + "为偶数");
		// }
		if (Q2.a % 3 == 0 && Q2.a % 7 == 0)
		{
			System.out.println("true");
			if (Q2.a % 2 == 1)
			{
				System.out.println(Q2.a + "为奇数");
			} else
			{
				System.out.println(Q2.a + "为偶数");
			}
		} else
		{
			System.out.println("false");
		}
	}
}
