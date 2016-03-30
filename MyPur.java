import java.util.Scanner; 

public class MyPur
{
	public static void main(String[] args)
	{
		int groundCount;
		int numberBought;
		double groundPrice;
		double Price;
		String name;
		
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入价格，格式如下：");
		System.out.println("例如，2.99美元买3个，就请输入「3 2.99」");
		System.out.println("下面请输入：");
		
		groundCount = reader.nextInt();
		groundPrice = reader.nextDouble();
		
		if ((groundCount <= 0)||(groundPrice <= 0))
		{
			System.out.println("对不起，价格和数量必须为正数。");
			System.out.println("请重新输入价格，格式如下：");
			System.out.println("例如，2.99美元买3个，就请输入「3 2.99」");
			System.out.println("下面请输入：");
			
			groundCount = reader.nextInt();
			groundPrice = reader.nextDouble();
		}
		
		System.out.println("请输入购买量");
		
		numberBought = reader.nextInt();
		
		if (numberBought <= 0)
		{
			System.out.println("对不起，购买量必须为正数。");
			System.out.println("请重新输入购买量");
			
			numberBought = reader.nextInt();		
		}
		
		System.out.println("您的购买量是" + numberBought + "个");
		System.out.println("价格为" + groundPrice + "美元" + groundCount + "个");
		
		Price = numberBought * (groundPrice/groundCount);
		
		System.out.println("您购买的商品总价为" + Price);		
	}
}
