package program;
import java.util.Scanner;
import java.util.Arrays;
public class Program36 {

public static void main(String[] args) {
	System.out.println("����һ��ʮ������������");
	Scanner scanner=new Scanner(System.in);
	int n=10;
	int[]arrA=new int[n];
	for (int i = 0; i < n; i++) {
		arrA[i]=scanner.nextInt();//��ȡʮ������
	}
	
	System.out.println("û�ƶ�ǰ�����飺"+Arrays.toString(arrA));
	System.out.println("������Ҫ�����ƶ��ĸ�����");
	int m=scanner.nextInt();//��ȡ���������˵ĸ���
	m%=n;//ʮ���൱��ѭ��
	int[]arrB=new int[n];//����������A��Сһ��������B
	int k=m;//����һ���ɱ�ı���
	for (int i = m; i < arrA.length;i++) {
		arrB[i]=arrA[i-m];
	}
	
	for (int i = 0; i <m;i++) {
		arrB[i]=arrA[arrA.length-k];
		k--;
	}
	System.out.println("�ƶ�������飺"+Arrays.toString(arrB));//�������B
	scanner.close();
	}
}
