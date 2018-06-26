package Question7;

public class TemperatureTransition
{
	// 温度的表示有两种：摄氏度和华氏度。
	// 转换公式： 摄氏度×9/5+32=华氏度
	//
	// 写一个方法，将摄氏度转成华氏度。
	public double temperatureTransition(double cdegree)
	{
		return cdegree * 9.0 / 5.0 + 32.0;
	}
	
	//方法重载
	public float temperatureTransition(float cdegree,float num)
	{
		return cdegree * num / 5.0f + 32.0f;
	}
}

