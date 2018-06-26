package Question7;

public class Question7
{
	// 温度的表示有两种：摄氏度和华氏度。
	// 转换公式： 摄氏度×9/5+32=华氏度
	//
	// 写一个方法，将摄氏度转成华氏度。
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PerfectSquare p = new PerfectSquare();
		p.perfectSquare(25, 999);

		TemperatureTransition t = new TemperatureTransition();
		double cdegree1 = -38.6;
		float cdegree2 = -38.6f;
		double fdegree1 = t.temperatureTransition(cdegree1);
		float fdegree2 = t.temperatureTransition(cdegree2, 9.0f);
		System.out.println(fdegree1); //
		System.out.println(fdegree2);
		System.out.printf("华氏度为%10.2f:", fdegree1);
	}

}
