package program;

import java.util.Scanner;

public class Progarm10 {
	public static void main(String[] args) {
		System.out.println("����С������ʱ�߶Ⱥ���ش���");
		Scanner scanner = new Scanner(System.in);
		float h = scanner.nextFloat();
		int n = scanner.nextInt();
		float sum = h;
		float h1 = h / 2;
		for (int i = 2; i <= n; i++) {
			sum += h1 * 2;
			h1 /= 2;
		}
		System.out.println("��"+h+"�ף�����"+n+"�κ��ܷ�����"+h1+"�ף������ľ��룺"+sum);
		scanner.close();
	}
}
