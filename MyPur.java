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
		System.out.println("������۸񣬸�ʽ���£�");
		System.out.println("���磬2.99��Ԫ��3�����������롸3 2.99��");
		System.out.println("���������룺");
		
		groundCount = reader.nextInt();
		groundPrice = reader.nextDouble();
		
		if ((groundCount <= 0)||(groundPrice <= 0))
		{
			System.out.println("�Բ��𣬼۸����������Ϊ������");
			System.out.println("����������۸񣬸�ʽ���£�");
			System.out.println("���磬2.99��Ԫ��3�����������롸3 2.99��");
			System.out.println("���������룺");
			
			groundCount = reader.nextInt();
			groundPrice = reader.nextDouble();
		}
		
		System.out.println("�����빺����");
		
		numberBought = reader.nextInt();
		
		if (numberBought <= 0)
		{
			System.out.println("�Բ��𣬹���������Ϊ������");
			System.out.println("���������빺����");
			
			numberBought = reader.nextInt();		
		}
		
		System.out.println("���Ĺ�������" + numberBought + "��");
		System.out.println("�۸�Ϊ" + groundPrice + "��Ԫ" + groundCount + "��");
		
		Price = numberBought * (groundPrice/groundCount);
		
		System.out.println("���������Ʒ�ܼ�Ϊ" + Price);		
	}
}
