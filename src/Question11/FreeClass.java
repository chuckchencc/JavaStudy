package Question11;

public class FreeClass
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

	public int id; // 课程ID
	public String name; // 课程名字
	public String lecturer; // 讲师姓名

	public FreeClass()
	{
		this.id = 0;
		this.name = null;
		this.lecturer = null;
	}

	public FreeClass(int id, String name, String lecturer)
	{
		this.id = id;
		this.name = name;
		this.lecturer = lecturer;
	}
	
	public void info()
	{
		System.out.println("父类");
	}

}
