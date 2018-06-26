package Question10;

public class Question10
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 一个点 Point
		// 属性: 横坐标x, 纵坐标y
		//
		// 一条线 Line
		// 属性：起点p1, 终点p2
		//
		// 试写出Point 和 Line类的定义，并为其添加几个构造方法
		Point p1=new Point(3,6);
		Point p2=new Point();
		Line l1=new Line(1,2,3,4);
		Line l2=new Line();
		Line l3=new Line(p1,p2);
	}

}
