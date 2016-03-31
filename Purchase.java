import java.util.*;//应该为Scanner

public class Purchase
{
	private String name;//字符串「名称」
	private double groundPrice;//双精度groundPrice
	private int numberBought;//整型「数量」
	private String name;
	
	public void setName(String newName)//方法「设定名称」
	{
		name = newName;
	}
	
	public void setPrice(int count, double costForCount )//方法「设定价格」。
	{
		if ((count <= 0) || (costForCount <= 0)) 
		{
			System.out.println("");//此处输出内容应当为错误提示，可能是出题的 学长||学姐 为了考验一下我们，就把内容删掉了。
			System.exit(0);
		}else
		{
			groundCount = count;
			groundPrice = costForCount;
		}
	}
	
	public void setNumberBought(int number)//方法「设定购买量」。
	{
		if (number <= 0) 
		{
			System.out.println("");//此处输出内容应当也是错误提示，空白的原因同上。
			System.exit(0);
		}
		else
			numberBought = number;
	}
	
	public void readInput() //公共方法「读取输入的内容」
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter name of item you are purchasing: ");
		name = keyboard.nextLine();//输入要买的东西的名字
		System.out.println("Enter price of item as two numbers.");//输入价格：多少美刀买多少个
		System.out.println("For example, 3 for $2.99 is entered as");
		System.out.println("3 2.99");//比如2.99美刀买三个，就输入"3 2.99"
		System.out.println("Enter price of item as two numbers, now:");
		groundCount = keyboard.nextint();//底量
		groundPrice = keyboard.nextDouble();//底价
		while (()) //循环条件应该是(groundCount <= 0) || (groundPrice <= 0),肯定又是出题的 学长||学姐 为了考验一下我们把内容删掉了。
		{
			System.out.println("Both numbers must be positive. Try again.");
			System.out.println("Enter price of item as two numbers.");
			System.out.println("For example, 3 for $2.99 is entered as");
			System.out.println("3 2.99");
			System.out.println("Enter price of item as two numbers, now:");
			groundCount = keyboard.nextint();
			groundPrice = keyboard.nextDouble();
		}
		System.out.println("");//字符串内容应为「请输入购买量」
		numberBought = keyboard.nextInt();
		while (numberBought <=0 )
		{
			System.out.println("");//字符串内容应为错误信息
			System.out.println("");//字符串内容应为「请输入购买量」
			numberBought = keyboard.nextint();
		}
	}
	
	public void writeOutput() //输出
	{
		System.out.println(numberBought + " " + name);//输出：「买了多少个什么什么玩意」
		System.out.println("at " + groundCount + "for $" + groundPrice);//输出价格：「多少多少美刀，能卖到多少多少个」
	}
	
	public String getName() //商品的名称
	{
		return name;
	}
	
	public double getTotalCost //计算总价
	{
		return ((groundPrice / groundCount) * numberBought);
	}

	public double getUnitCost()//计算单价
	{
		return (groundPrice / groundCount);
	}

	public int getnumberBought()//购买量
	{
	return numberBought;
	}
}