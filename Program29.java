package program;

import java.util.Scanner;

public class Program29 {
	public static void main(String[] args) {
		System.out.println("������9�����֣�");
		Scanner scanner = new Scanner(System.in);
		int[][] arr = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		System.out.println("��һ���Խ���֮�ͣ�" + (arr[0][0] + arr[1][1] + arr[2][2]));
		System.out.println("�ڶ����Խ���֮�ͣ�" + (arr[0][2] + arr[1][1] + arr[2][0]));
		scanner.close();
	}
}
