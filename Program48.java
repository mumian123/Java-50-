package program;
import java.util.Scanner;
public class Program48 {
	public static void main(String[] args) {
		int[] num=new int[4];//�����λ���ĸ�ʮ��ǧλ
		System.out.println("������һ����λ����");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		for (int i = 0; i < 4;i++) {//���ȡλ���Ӹ�λ��ʼ,����Ҫ���滻
			num[i]=(input%10+5)%10;
			input/=10;

}

		//��Ҫ���滻,����1��4λ
		int temp=0;//������
		temp=num[0];
		num[0]=num[3];
		num[3]=temp;

		//����2��3λ
		temp=num[1];
		num[1]=num[2];
		num[2]=temp;
		System.out.println("���ܺ�Ľ����"+num[3]+num[2]+num[1]+num[0]);
		scanner.close();
	}

}
