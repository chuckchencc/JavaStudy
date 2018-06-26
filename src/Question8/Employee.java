package Question8;

public class Employee
{
	public String number; // 工号
	public String name; // 姓名
	public boolean sex; // 性别：true为男性，false为女性
	public int workingAge; // 工龄
	public int annualLeave; // 年假

	public int AnnualLeave()
	{
		if (workingAge >= 1 && workingAge < 10)
		{
			annualLeave = 5;
		} else if (workingAge >= 10 && workingAge < 20)
		{
			annualLeave = 10;
		} else if (workingAge >= 20)
		{
			annualLeave = 15;
		} else
		{
			annualLeave = 0;
		}

		if (!sex)
		{
			annualLeave++;
		}

		return annualLeave;
	}

}
