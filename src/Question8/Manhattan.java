package Question8;

public class Manhattan
{
	public int x;
	public int y;

	public int manhattan(Manhattan m)
	{
		return Math.abs(m.x-this.x)+Math.abs(m.y-this.y);
	}
}
