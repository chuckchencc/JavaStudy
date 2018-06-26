package Question8;

public class Question8
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 类： 三角形
		//
		// 属性： 3条边长
		//
		// 方法： 添加一个方法，求期周长。
		Triangle t = new Triangle();
		t.sideA = 5;
		t.sideB = 12;
		t.sideC = 13;
		int perimeter = t.perimeter();
		System.out.println(perimeter);

		// 企业员工
		//
		// 有以下属性：
		// 工号
		// 姓名
		// 性别
		// 工龄
		//
		// 添加一个方法，计算其年假。
		// * 职工累计工作已满1年不满10年的，年休假5天；已满10年不满20年的，年休假10天；已满20年的，年休假15天。
		// * 女性员工，多享受一天年假。

		Employee e = new Employee();
		e.number = "000512";
		e.name = "Cc";
		e.sex = true;
		e.workingAge = 0;
		int annualLeave = e.AnnualLeave();
		System.out.println(e.name + "的年假为：" + annualLeave + "天");

		// 计算机画图时，有点的概念，每个点由它的横坐标x 和 纵坐标 y 描述。
		//
		// 写一个类。
		//
		// 求两个点之间的曼哈顿距离 = 横向距离 + 纵向距离
		//
		// 例如，一个点(0,0) 和另一个点（1，1）的曼哈顿距离为2
		Manhattan m1 = new Manhattan();
		m1.x = -1;
		m1.y = -1;

		Manhattan m2 = new Manhattan();
		m2.x = 2;
		m2.y = 3;

		int distance = m1.manhattan(m2);
		System.out.println("两点的曼哈顿距离为：" + distance);

	}

}
