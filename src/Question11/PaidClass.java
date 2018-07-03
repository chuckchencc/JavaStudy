package Question11;

public class PaidClass extends FreeClass
{
	// 某在线课堂上有免费课程和收费课程。
	//
	// 免费课程有以下信息：
	// 课程ID
	// 课程名字
	// 讲师姓名
	//
	// 收费课程有以下信息：
	// 课程ID
	// 课程名字
	// 讲师姓名
	// 费用
	// QQ群号
	// 辅导老师姓名
	//
	// 请写两个类来描述它们。
	
	private double cost;// 费用
	private String QQnumber;// QQ群号
	private String teacher;// 辅导老师姓名

	public double getCost()
	{
		return cost;
	}

	public String getQQnumber()
	{
		return QQnumber;
	}

	public String getTeacher()
	{
		return teacher;
	}

	public PaidClass()
	{
		this.cost = 0;
		this.QQnumber = null;
		this.teacher = null;
		// TODO Auto-generated constructor stub
	}

	//构造方法重载
	public PaidClass(int id, String name, String lecturer)
	{
		super(id, name, lecturer);
		this.cost = 99.8;
		this.QQnumber = "425479147";
		this.teacher = "李四";
		// TODO Auto-generated constructor stub
	}
	
	//方法重写
	@Override
	public void info()
	{
		System.out.println("子类");
	}
	


}
