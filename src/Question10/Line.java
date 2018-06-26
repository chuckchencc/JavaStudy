package Question10;

public class Line
{
	// Point p1=new Point(1,2);
	// Point p2=new Point(3,4);
	private Point start;
	private Point end;

	public Line()
	{
		start = new Point();
		end = new Point();
	}

	public Line(int x1, int y1, int x2, int y2)
	{
		start = new Point(x1, y1);
		end = new Point(x2, y2);
	}

	public Line(Point p1, Point p2)
	{
		this.start = p1;
		this.end = p2;
	}

}
