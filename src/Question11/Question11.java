package Question11;

public class Question11
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
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
		
		PaidClass pc1 = new PaidClass(10086,"数学","张三");
		
		int id = pc1.id;
		String name = pc1.name;
		String lecturer = pc1.lecturer;
		
		// int id = pc2.id;
		// String name = pc2.name;
		// String lecturer = pc2.lecturer;
		
		double cost = pc1.getCost();
		String QQnumber = pc1.getQQnumber();
		String teacher = pc1.getTeacher();
		
		System.out.println("课程ID：" + id);
		System.out.println("课程名字：" + name);
		System.out.println("讲师姓名：" + lecturer);
		System.out.println("费用：" + cost);
		System.out.println("QQ群号：" + QQnumber);
		System.out.println("辅导老师姓名：" + teacher);

		
		FreeClass pc2 = pc1;//隐式转换，PaidClass->FreeClass，子类转父类
		PaidClass pc3 = (PaidClass)pc2;//显式转换，FreeClass->PaidClass，父类转子类
		pc2.info();//多态表现，pc1是子类对象，pc2隐式转换为父类对象，但是调用的方法在子类中被重写了，因此最终调用子类中的方法
		pc2.id=1000;
		int a = pc3.id;
		System.out.println(a);
	}

}
