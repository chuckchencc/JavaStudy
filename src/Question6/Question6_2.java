package Question6;

public class Question6_2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// 每一个网站有以下信息：
		//
		// 域名： afanihao.cn
		// 名称： 阿发你好
		// 备案号： 23091023
		// 公网IP： 123.56.150.87
		// 联系人：
		// 姓名：邵发
		// 电话：138000011111
		// 住址：XXXXXXXX
		//
		// 设计一个类描述一下上述信息。
		Web w = new Web();
		w.domain = "afanihao.cn";
		w.webName = " 阿发你好";
		w.recordNumber = 23091023;
		w.IP = "123.56.150.87";
		w.name = "邵发";
		w.cellphone = "138000011111";
		w.address = "XXXXXXXX";
		System.out.println("每一个网站有以下信息：");
		System.out.println("域名：" + w.domain);
		System.out.println("名称：" + w.webName);
		System.out.println("备案号：" + w.recordNumber);
		System.out.println("公网IP：" + w.IP);
		System.out.println("联系人：");
		System.out.println("	姓名：" + w.name);
		System.out.println("	电话：" + w.cellphone);
		System.out.println("	住址：" + w.address);
	}

}
