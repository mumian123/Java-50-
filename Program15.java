package program;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		System.out.println("����������");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int temp = 0;
		if (num1 > num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if (num1 > num3) {
			temp = num1;
			num1 = num3;
			num3 = temp;
		}
		if (num2 > num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		System.out.println("����������С�������У�"+num1+"  "+num2+"  "+num3);
		scanner.close();
	}
}
