package program;

import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		int sum = 0, temp = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("������a��ֵ��");
		int a = scanner.nextInt();
		System.out.println("������n��ֵ��");
		int n = scanner.nextInt();
		for (int j = 0; j < n; j++) {
			temp += a * (int)Math.pow(10, j);
			sum += temp;
		}		
		System.out.println(sum);
		scanner.close();
	}
}
