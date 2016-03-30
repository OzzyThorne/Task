import java.util.*;//应该为Scanner
/**
这个程序怎么没有main方法？？
*/
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
		System.out.println("");//字符串内容应该是「请输入购买量」
		numberBought = keyboard.nextInt();
		while (numberBought <=0 )
		{
			System.out.println("");//字符串内容应该是错误信息
			System.out.println("");//字符串内容应该是「请输入购买量」
			numberBought = keyboard.nextint();
		}
	}
	
	public void writeOutput() //公共方法：输出
	{
		System.out.println(numberBought + " " + name);//输出：「买了多少个什么什么玩意」
		System.out.println("at " + groundCount + "for $" + groundPrice);//输出价格：「多少多少美刀，能卖到多少多少个」
	}
	
	public String getName() //获得商品的名称
	{
		return name;
	}
	
	public double getTotalCost //计算总价（这里少了一对括号吧？）
	{
		return ((groundPrice / groundCount) * numberBought);
	}

	public double getUnitCost()//计算单价
	{
		return (groundPrice / groundCount);
	}

	public int getnumberBought()//获得购买量
	{
	return numberBought;
	}
}
/**
题目与答案：

1.变量groundCount、groundPrice、numberBought 分别代表什么？
	答：groundCount和groundPrice是价格的两个组成部分。这里的价格是以「多少钱买多少个」的形式表示的。
		groundCount是数量，groundPrice就是相对于这个数量的价格。
		numberBought则是购买量。
2.总结上述代码中出现的类的特点，如信息是如何传递的，越多越好
	答：
3.你认为这个程序是用来做什么的？
	答：这是一个总价计算器，输入商品的价格和购买的数量，输出总价。
*/