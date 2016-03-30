import java.util.Scanner;  
  
//�����ֳ�����,��ָ��һ������1����Ȼ���У�����1�ʹ����������⣬���ܱ�������Ȼ����������  
public class WebPrime {  
  
    public static void main(String[] args) {  
  
        Scanner scan = new Scanner(System.in);// ɨ���������տ���̨������Ϣ  
  
        System.out.print("������һ��������");  
  
        try {  
            int num = scan.nextInt();// ȡ������̨�������Ϣ  
            if (isPrime(num)) {// ����isPrime()����  
  
                System.out.println(num + "��������");// ��isPrime()��������true,���������  
  
            } else {  
  
                System.out.println(num + "����������");// ��isPrime()��������false,�����������  
            }  
        } catch (Exception e) {  
            System.out.println("����������");// ��׽�쳣��������Ĳ�������������쳣  
        }  
    }  
  
    /** 
     * <pre> 
     * �����ж�һ�����Ƿ�Ϊ��������Ϊ����������true,���򷵻�false 
     * </pre> 
     *  
     * @param a 
     *            �����ֵ 
     * @return true��false 
     */  
    public static boolean isPrime(int a) {  
  
        boolean flag = true;  
  
        if (a < 2) {// ������С��2  
            return false;  
        } else {  
  
            for (int i = 2; i <= Math.sqrt(a); i++) {  
  
                if (a % i == 0) {// ���ܱ���������˵����������������false  
  
                    flag = false;  
                    break;// ����ѭ��  
                }  
            }  
        }  
        return flag;  
    }  
}  
