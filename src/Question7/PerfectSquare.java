package Question7;

//找出 100~999 之间所有的 “完全平方数”
//
//例如，
//
//1 = 1 x1
//4 = 2 x 2
//9 = 3 x 3
//16 = 4 x 4
// 
//所以 1 4 9 16都是完全平方数

public class PerfectSquare
{
	public void perfectSquare(int lower, int upper)
	{
		for (int i = lower; i <= upper; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				int temp1 = i / j;
				int temp2 = i % j;
				if (temp1 == j && temp2 == 0)
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}
