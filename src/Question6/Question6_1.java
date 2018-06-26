package Question6;

public class Question6_1
{
	// 添加一个类，描述一部电影的信息: 片名，主演，上映年份，票房
	//
	// 创建一个对象
	// 片名： 战狼2
	// 主演：吴京
	// 上映： 2017
	// 票房: 45亿
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.name = "战狼2";
		m.actor = "吴京";
		m.starttime = 2017;
		m.ticketOffice = 45;
		System.out.println("片名：" + m.name);
		System.out.println("主演：" + m.actor);
		System.out.println("年份：" + m.starttime);
		System.out.println("票房：" + m.ticketOffice + "亿");
	}

}
