package program;
import java.util.Scanner;
public class Program48 {
	public static void main(String[] args) {
		int[] num=new int[4];//存放四位数的个十百千位
		System.out.println("请输入一个四位数：");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		for (int i = 0; i < 4;i++) {//逐次取位，从个位开始,并按要求替换
			num[i]=(input%10+5)%10;
			input/=10;

}

		//按要求替换,交换1、4位
		int temp=0;//交换数
		temp=num[0];
		num[0]=num[3];
		num[3]=temp;

		//交换2、3位
		temp=num[1];
		num[1]=num[2];
		num[2]=temp;
		System.out.println("加密后的结果："+num[3]+num[2]+num[1]+num[0]);
		scanner.close();
	}

}
