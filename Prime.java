import java.util.Scanner; 

public class Prime
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		System.out.println("��������Ҫ�жϵ�����");
		
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
			System.out.println("���������Ϊ����");
		else
			System.out.println("�����������Ϊ����");
	}
}