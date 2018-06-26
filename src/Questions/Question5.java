package Questions;

public class Question5
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int[] abc = { 29, 90, 48, 92 };

		// 正序输出
		for (int i = 0; i < abc.length; i++)
		{
			int n = abc[i];
			System.out.print(n + " "); // 空格分开
		}
		System.out.println();

		// 倒序输出
		for (int i = abc.length - 1; i >= 0; i--)
		{
			int n = abc[i];
			System.out.print(n + " ");
		}
		System.out.println();

		// 输出6的倍数
		for (int i = 0; i < abc.length; i++)
		{
			if (abc[i] % 6 == 0)
			{
				int n = abc[i];
				System.out.print(n + " ");
			}
		}
		System.out.println();

		// 第一个数和最后一个数对调
		int[] def = { 29, 90, 48, 92, 33 };
		int temp = def[def.length - 1];
		def[def.length - 1] = def[0];
		def[0] = temp;
		for (int i = 0; i < def.length; i++)
		{
			// System.out.println(abc[i]);
			int n = def[i];
			System.out.print(n + " ");
		}
		System.out.println();

		// 将里面的负数变成正值
		double[] arr = { 90.0, -98.34, -10, 199 };
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] < 0)
			{
				arr[i] = Math.abs(arr[i]);
			}
			double n = arr[i];
			System.out.print(n + " ");
		}
		System.out.println();

		// 把src的内容拷贝到dst里
		double[] src = { 4, 5.5, 6, 7.7 };
		double[] dst = new double[4];
		for (int i = 0; i < src.length; i++)
		{
			dst[i] = src[i];
			double n = dst[i];
			System.out.print(n + " ");
		}
		System.out.println();

		// 以下有四个学生的信息，请用数组表示：
		//
		// 姓名 分数
		// ----------------------------------
		// 邵 97
		// 王 89
		// 张 94
		// 李 93
		//
		// 定义两个数组 String[] 和 int[] ，并按行打印出来
		String[] name = { "邵", "王", "张", "李" };
		int[] number = { 97, 89, 94, 93 };
		System.out.println("姓名                             分数");
		System.out.println("----------------------------------");
		for (int i = 0; i < name.length; i++)
		{
			System.out.println(name[i] + "                                 " + number[i]);
		}

		// 任意给定一个数组,
		// double[] src = { 4, 5.5, 6, 7.7 };
		//
		// 写代码把 src 中的内容倒序存储。倒序后，src的内容变成: 7.7 6 5.5 4
		double[] cc = { 4, 5.5, 6, 7.7 };
		double[] dd = new double[4];
		for (int i = cc.length - 1; i >= 0; i--)
		{
			int j = 0;
			dd[j] = cc[i];
			double n = dd[j];
			System.out.print(n + " ");
			j++;
		}
		System.out.println();

		// 求出所有1000以内的质数，并存到数组里。
		//
		// int[] result = new int[50]; // 最多存50个
		// int count = 0;
		//
		// 即，把找到的质数存到数组 result 里，count表示实际存入的个数
		int[] result = new int[50];
		int count = 0;	
		for (int i = 2; i <= 1000; i++)
		{
			int num = 0;
			double sqrt = Math.sqrt(i);
			for (int j = 2; j <= sqrt; j++)
			{
				if (i % j == 0)
				{
					num++;
				}
			}
			if (num == 0)
			{
				result[ count ] = i;
				count ++;
				if(count >= result.length)
				{
					break; // 已经存满50个，则退出查找
				}
			}
		}
		for(int i=0; i<count; i++)
		{
			System.out.print(result[i]+" ");
		}
		
		
//		int[] result = new int[50]; // 最多存50个
//		int count = 0;
//		
//		for(int i=2; i<1000; i++)
//		{
//			// 判断 i 是否为质数
//			boolean isPrime = true;
//			for(int k=2; k<i; k++)
//			{
//				if( i % k == 0)
//				{
//					isPrime = false;
//					break;
//				}
//			}
//			
//			// 如果是质数，则存到数组result里
//			if( isPrime )
//			{
//				result[ count ] = i;
//				count ++;
//				if(count >= result.length)
//				{
//					break; // 已经存满50个，则退出查找
//				}
//			}
//		}
//		
//		// 把找到的质数打印输出
//		for(int i=0; i<count; i++)
//		{
//			System.out.println( result[i] );
//		}

	}

}
