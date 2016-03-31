import java.util.Scanner; 

public class Prime
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入需要判断的整数");
		
		int x = reader.nextInt(), i = 2 , m ;
		boolean n = true;
		
		if (x < 2)
		{
			n = false;
		}
		else
		{
			for (;i < x ;i = i+1)
			{
				if(x % i == 0)
				{
					n = false;
					break;
				}
			}
		}
		
		if (n == true)
			System.out.println("您输入的数为素数");
		else
			System.out.println("您输入的数不为素数");
	}
}