# Answers
## 第一题的答案：</br>
<pre><code>import java.util.Scanner; 

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
</code></pre>
</br>
已在此仓库中保存为Prime.java。地址如下：</br>
</br>
https://github.com/OzzyThorne/Task/blob/master/Prime.java  </br>
</br>
## 第二题的答案：</br>
</br>
原程序：https://github.com/OzzyThorne/Task/blob/master/Purchase.java  </br>
</br>
### 1.变量groundCount、groundPrice、numberBought 分别代表什么？</br>
答：</br>
groundCount和groundPrice是价格的两个组成部分。这里的价格是以「多少钱买多少个」的形式输入的，groundCount是底量，groundPrice就是相对于这个底量的底价。然后在后面的方法中根据这两个变量来计算UnitCost和TotalCost。</br>
numberBought则是购买量。</br>
</br>
### 2.总结上述代码中出现的类的特点（如信息是如何传递的，越多越好）。</br>
答：</br>
一开始我想了半天都没想明白有什么特点，于是我就做了这样两件事：第一，从网上找了一个质数判断程序；第二，自己写了一个Purchase程序。为了表示区别，我把这两个程序的主类名称进行了修改，一个叫WebPrime，另一个叫MyPur，地址如下：</br>
</br>
https://github.com/OzzyThorne/Task/blob/master/WebPrime.java </br>
https://github.com/OzzyThorne/Task/blob/master/MyPur.java </br>
</br>
我对Prime、Purchase、WebPrime、MyPur这四个程序进行比较后，立刻发现了不同之处：我写的程序只有一个主类和一个main方法，所有代码是按照要做的事情的过程一条线地写下来，而考题中的程序和我从网上找的程序有多个类多个方法，每个方法都是封装的，一个封装的方法只做一件特定的简单的事情，多个类和多个方法之间相互调用，协同完成整个程序。查阅图书和网络资料之后，我知道了，这就是所谓的「面向对象」的一大特点，而我的思维方式还是初中学习Pascal时的。</br>
</br>
萌新一枚，表示并不能发现更多的特点。我想，「面向对象」就是上述代码中我能发现的最大的特点吧。</br>
</br>
### 3.你认为这个程序是用来做什么的？</br>
答：</br>
这是一个总价计算器，输入商品的价格和购买的数量，输出总价。</br>
